package dev.chiksmedina.solar.broken.foodkitchen

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
import dev.chiksmedina.solar.broken.FoodKitchenGroup

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
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.6266f, 16.3991f)
                curveTo(3.8036f, 19.054f, 3.8921f, 20.3815f, 4.7571f, 21.1907f)
                curveTo(5.6221f, 22.0f, 6.9525f, 22.0f, 9.6133f, 22.0f)
                horizontalLineTo(10.3867f)
                curveTo(13.0475f, 22.0f, 14.3779f, 22.0f, 15.2429f, 21.1907f)
                curveTo(16.1079f, 20.3815f, 16.1964f, 19.054f, 16.3734f, 16.3991f)
                lineTo(16.7156f, 11.2661f)
                curveTo(16.8489f, 9.2669f, 16.9155f, 8.2673f, 16.3227f, 7.6336f)
                curveTo(15.7299f, 7.0f, 14.7281f, 7.0f, 12.7245f, 7.0f)
                horizontalLineTo(7.2755f)
                curveTo(5.2719f, 7.0f, 4.2701f, 7.0f, 3.6773f, 7.6336f)
                curveTo(3.0845f, 8.2673f, 3.1511f, 9.2669f, 3.2844f, 11.2661f)
                lineTo(3.3422f, 12.133f)
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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 18.75f)
                curveTo(10.4142f, 18.75f, 10.75f, 18.4142f, 10.75f, 18.0f)
                curveTo(10.75f, 17.5858f, 10.4142f, 17.25f, 10.0f, 17.25f)
                verticalLineTo(18.75f)
                close()
                moveTo(13.5f, 17.25f)
                curveTo(13.0858f, 17.25f, 12.75f, 17.5858f, 12.75f, 18.0f)
                curveTo(12.75f, 18.4142f, 13.0858f, 18.75f, 13.5f, 18.75f)
                verticalLineTo(17.25f)
                close()
                moveTo(10.0f, 17.25f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.75f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.25f)
                close()
                moveTo(16.0f, 17.25f)
                horizontalLineTo(13.5f)
                verticalLineTo(18.75f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.25f)
                close()
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
                moveTo(10.0508f, 5.0614f)
                lineTo(10.4614f, 4.4857f)
                curveTo(10.6882f, 4.1678f, 10.6143f, 3.7262f, 10.2964f, 3.4994f)
                curveTo(9.9784f, 3.2727f, 9.9045f, 2.8311f, 10.1313f, 2.5132f)
                lineTo(10.5419f, 1.9375f)
            }
        }
            .build()
        return _cupHot!!
    }

private var _cupHot: ImageVector? = null
