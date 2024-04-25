package io.chagchagchag.example.springdoc_example.member;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MembersController {
  @GetMapping(path = "/members/{memberId}")
  @Parameters(value = {
      @Parameter(name = "memberId", description = "회원 id", example = "1")
  })
  @Operation(summary = "회원조회", description = "회원조회")
  ResponseEntity<String> findMembershipByMemberId(@PathVariable(name = "memberId") String memberId){
    return ResponseEntity.ok("memberId = " + memberId + " is now OK");
  }
}
