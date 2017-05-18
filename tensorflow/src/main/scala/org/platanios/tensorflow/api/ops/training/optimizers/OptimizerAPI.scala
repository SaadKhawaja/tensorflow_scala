package org.platanios.tensorflow.api.ops.training.optimizers

import org.platanios.tensorflow.api.ops.training.optimizers

/**
  * @author Emmanouil Antonios Platanios
  */
private[api] trait OptimizerAPI {
  type Optimizer = optimizers.Optimizer
  val Optimizer = optimizers.Optimizer

  type GradientDescent = optimizers.GradientDescent
  val GradientDescent = optimizers.GradientDescent

  type AdaGrad = optimizers.AdaGrad
  val AdaGrad = optimizers.AdaGrad
}