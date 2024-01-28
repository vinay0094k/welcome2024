// import org.springframework.boot.actuate.health.Health;
// import org.springframework.boot.actuate.health.HealthIndicator;
// import org.springframework.stereotype.Component;

// @Component
// public class CustomHealthIndicator implements HealthIndicator {

//     @Override
//     public Health health() {
//         //custom readiness checks here
//         // Return Health.up() for a healthy state, Health.down() for an unhealthy state

//         if (isHealthy()) {
//             return Health.up().build();
//         } else {
//             return Health.down().withDetail("Reason", "Resource unavailable").build();
//         }
//     }

//     private boolean isHealthy() {
//         // Implement your logic to check readiness
//         // Return true for a healthy state, false for an unhealthy state
//         // check database connections, external services, etc.
//         return true;
//     }
// }
