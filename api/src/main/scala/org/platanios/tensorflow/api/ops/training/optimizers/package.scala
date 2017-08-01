/* Copyright 2017, Emmanouil Antonios Platanios. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.platanios.tensorflow.api.ops.training

/**
  * @author Emmanouil Antonios Platanios
  */
package object optimizers {
  private[api] trait API {
    type Optimizer = optimizers.Optimizer
    val Optimizer = optimizers.Optimizer

    type GradientDescent = optimizers.GradientDescent
    val GradientDescent = optimizers.GradientDescent

    type AdaGrad = optimizers.AdaGrad
    val AdaGrad = optimizers.AdaGrad
  }

  private[api] object API extends API
}