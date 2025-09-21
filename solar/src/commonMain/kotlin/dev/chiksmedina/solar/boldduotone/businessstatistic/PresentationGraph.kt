package dev.chiksmedina.solar.boldduotone.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.BusinessStatisticGroup

val BusinessStatisticGroup.PresentationGraph: ImageVector
    get() {
        if (_presentationGraph != null) {
            return _presentationGraph!!
        }
        _presentationGraph = Builder(
            name = "PresentationGraph", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 10.5f)
                verticalLineTo(2.75f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.5f)
                curveTo(20.0f, 13.5641f, 20.0f, 15.0962f, 18.9958f, 16.0481f)
                curveTo(17.9916f, 17.0f, 16.3753f, 17.0f, 13.1429f, 17.0f)
                horizontalLineTo(12.75f)
                horizontalLineTo(11.25f)
                horizontalLineTo(10.8571f)
                curveTo(7.6247f, 17.0f, 6.0084f, 17.0f, 5.0042f, 16.0481f)
                curveTo(4.0f, 15.0962f, 4.0f, 13.5641f, 4.0f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.5303f, 9.0303f)
                curveTo(15.8232f, 8.7374f, 15.8232f, 8.2626f, 15.5303f, 7.9697f)
                curveTo(15.2374f, 7.6768f, 14.7626f, 7.6768f, 14.4697f, 7.9697f)
                lineTo(13.1768f, 9.2626f)
                curveTo(13.1067f, 9.3326f, 13.0499f, 9.3894f, 13.0f, 9.4377f)
                curveTo(12.9501f, 9.3894f, 12.8933f, 9.3326f, 12.8232f, 9.2626f)
                lineTo(12.213f, 8.6524f)
                curveTo(12.0681f, 8.5073f, 11.9113f, 8.3504f, 11.7612f, 8.2358f)
                curveTo(11.5852f, 8.1016f, 11.3335f, 7.9571f, 11.0f, 7.9571f)
                curveTo(10.6665f, 7.9571f, 10.4148f, 8.1016f, 10.2388f, 8.2358f)
                curveTo(10.0887f, 8.3504f, 9.9319f, 8.5073f, 9.7869f, 8.6524f)
                lineTo(8.4697f, 9.9697f)
                curveTo(8.1768f, 10.2626f, 8.1768f, 10.7374f, 8.4697f, 11.0303f)
                curveTo(8.7626f, 11.3232f, 9.2374f, 11.3232f, 9.5303f, 11.0303f)
                lineTo(10.8232f, 9.7374f)
                curveTo(10.8933f, 9.6674f, 10.9501f, 9.6106f, 11.0f, 9.5623f)
                curveTo(11.0499f, 9.6106f, 11.1067f, 9.6674f, 11.1768f, 9.7374f)
                lineTo(11.7869f, 10.3476f)
                curveTo(11.9319f, 10.4927f, 12.0887f, 10.6496f, 12.2388f, 10.7642f)
                curveTo(12.4148f, 10.8984f, 12.6665f, 11.0429f, 13.0f, 11.0429f)
                curveTo(13.3335f, 11.0429f, 13.5852f, 10.8984f, 13.7612f, 10.7642f)
                curveTo(13.9113f, 10.6496f, 14.0681f, 10.4927f, 14.2131f, 10.3476f)
                lineTo(15.5303f, 9.0303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 1.25f)
                curveTo(1.5858f, 1.25f, 1.25f, 1.5858f, 1.25f, 2.0f)
                curveTo(1.25f, 2.4142f, 1.5858f, 2.75f, 2.0f, 2.75f)
                horizontalLineTo(4.0f)
                horizontalLineTo(20.0f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 2.75f, 22.75f, 2.4142f, 22.75f, 2.0f)
                curveTo(22.75f, 1.5858f, 22.4142f, 1.25f, 22.0f, 1.25f)
                horizontalLineTo(2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.2502f, 17.0f)
                verticalLineTo(20.5365f)
                lineTo(9.6648f, 21.3292f)
                curveTo(9.2943f, 21.5144f, 9.1441f, 21.9649f, 9.3293f, 22.3354f)
                curveTo(9.5146f, 22.7059f, 9.9651f, 22.8561f, 10.3356f, 22.6708f)
                lineTo(12.0002f, 21.8385f)
                lineTo(13.6648f, 22.6708f)
                curveTo(14.0352f, 22.8561f, 14.4857f, 22.7059f, 14.671f, 22.3354f)
                curveTo(14.8562f, 21.9649f, 14.7061f, 21.5144f, 14.3356f, 21.3292f)
                lineTo(12.7502f, 20.5365f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.2502f)
                close()
            }
        }
            .build()
        return _presentationGraph!!
    }

private var _presentationGraph: ImageVector? = null
