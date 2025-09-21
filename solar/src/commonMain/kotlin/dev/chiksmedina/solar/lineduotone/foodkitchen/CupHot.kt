package dev.chiksmedina.solar.lineduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.FoodKitchenGroup

val FoodKitchenGroup.CupHot: ImageVector
    get() {
        if (_cupHot != null) {
            return _cupHot!!
        }
        _cupHot = Builder(
            name = "CupHot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.2844f, 11.2661f)
                curveTo(3.1511f, 9.2669f, 3.0845f, 8.2673f, 3.6773f, 7.6336f)
                curveTo(4.2701f, 7.0f, 5.2719f, 7.0f, 7.2755f, 7.0f)
                horizontalLineTo(12.7245f)
                curveTo(14.7281f, 7.0f, 15.7299f, 7.0f, 16.3227f, 7.6336f)
                curveTo(16.9155f, 8.2673f, 16.8489f, 9.2669f, 16.7156f, 11.2661f)
                lineTo(16.3734f, 16.3991f)
                curveTo(16.1964f, 19.054f, 16.1079f, 20.3815f, 15.2429f, 21.1907f)
                curveTo(14.3779f, 22.0f, 13.0475f, 22.0f, 10.3867f, 22.0f)
                horizontalLineTo(9.6133f)
                curveTo(6.9525f, 22.0f, 5.6221f, 22.0f, 4.7571f, 21.1907f)
                curveTo(3.8921f, 20.3815f, 3.8036f, 19.054f, 3.6266f, 16.3991f)
                lineTo(3.2844f, 11.2661f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 17.0f)
                horizontalLineTo(18.0f)
                curveTo(20.2091f, 17.0f, 22.0f, 15.2091f, 22.0f, 13.0f)
                curveTo(22.0f, 10.7909f, 20.2091f, 9.0f, 18.0f, 9.0f)
                horizontalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 18.0f)
                horizontalLineTo(3.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0508f, 5.0614f)
                lineTo(6.4614f, 4.4857f)
                curveTo(6.6882f, 4.1678f, 6.6143f, 3.7262f, 6.2964f, 3.4994f)
                curveTo(5.9784f, 3.2727f, 5.9046f, 2.8311f, 6.1313f, 2.5132f)
                lineTo(6.542f, 1.9375f)
                moveTo(14.0508f, 5.0614f)
                lineTo(14.4614f, 4.4857f)
                curveTo(14.6882f, 4.1678f, 14.6143f, 3.7262f, 14.2964f, 3.4994f)
                curveTo(13.9784f, 3.2727f, 13.9046f, 2.8311f, 14.1313f, 2.5132f)
                lineTo(14.5419f, 1.9375f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0507f, 5.0614f)
                lineTo(10.4613f, 4.4857f)
                curveTo(10.6881f, 4.1678f, 10.6142f, 3.7262f, 10.2963f, 3.4994f)
                curveTo(9.9784f, 3.2727f, 9.9045f, 2.8311f, 10.1313f, 2.5132f)
                lineTo(10.5419f, 1.9375f)
            }
        }
            .build()
        return _cupHot!!
    }

private var _cupHot: ImageVector? = null
