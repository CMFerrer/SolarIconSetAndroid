package dev.chiksmedina.solar.bold.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.BusinessStatisticGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 1.25f)
                curveTo(1.5858f, 1.25f, 1.25f, 1.5858f, 1.25f, 2.0f)
                curveTo(1.25f, 2.4142f, 1.5858f, 2.75f, 2.0f, 2.75f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.5f)
                curveTo(4.0f, 13.5641f, 4.0f, 15.0962f, 5.0042f, 16.0481f)
                curveTo(6.0084f, 17.0f, 7.6247f, 17.0f, 10.8571f, 17.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(20.5365f)
                lineTo(9.6646f, 21.3292f)
                curveTo(9.2941f, 21.5144f, 9.1439f, 21.9649f, 9.3292f, 22.3354f)
                curveTo(9.5144f, 22.7059f, 9.9649f, 22.8561f, 10.3354f, 22.6708f)
                lineTo(12.0f, 21.8385f)
                lineTo(13.6646f, 22.6708f)
                curveTo(14.0351f, 22.8561f, 14.4856f, 22.7059f, 14.6708f, 22.3354f)
                curveTo(14.8561f, 21.9649f, 14.7059f, 21.5144f, 14.3354f, 21.3292f)
                lineTo(12.75f, 20.5365f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.1429f)
                curveTo(16.3753f, 17.0f, 17.9916f, 17.0f, 18.9958f, 16.0481f)
                curveTo(20.0f, 15.0962f, 20.0f, 13.5641f, 20.0f, 10.5f)
                verticalLineTo(2.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 2.75f, 22.75f, 2.4142f, 22.75f, 2.0f)
                curveTo(22.75f, 1.5858f, 22.4142f, 1.25f, 22.0f, 1.25f)
                horizontalLineTo(2.0f)
                close()
                moveTo(15.5303f, 7.9697f)
                curveTo(15.8232f, 8.2626f, 15.8232f, 8.7374f, 15.5303f, 9.0303f)
                lineTo(14.2131f, 10.3476f)
                curveTo(14.0681f, 10.4927f, 13.9113f, 10.6496f, 13.7612f, 10.7642f)
                curveTo(13.5852f, 10.8984f, 13.3335f, 11.0429f, 13.0f, 11.0429f)
                curveTo(12.6665f, 11.0429f, 12.4148f, 10.8984f, 12.2388f, 10.7642f)
                curveTo(12.0887f, 10.6496f, 11.9319f, 10.4927f, 11.7869f, 10.3476f)
                lineTo(11.1768f, 9.7374f)
                curveTo(11.1067f, 9.6674f, 11.0499f, 9.6106f, 11.0f, 9.5623f)
                curveTo(10.9501f, 9.6106f, 10.8933f, 9.6674f, 10.8232f, 9.7374f)
                lineTo(9.5303f, 11.0303f)
                curveTo(9.2374f, 11.3232f, 8.7626f, 11.3232f, 8.4697f, 11.0303f)
                curveTo(8.1768f, 10.7374f, 8.1768f, 10.2626f, 8.4697f, 9.9697f)
                lineTo(9.7869f, 8.6524f)
                curveTo(9.9319f, 8.5073f, 10.0887f, 8.3504f, 10.2388f, 8.2358f)
                curveTo(10.4148f, 8.1016f, 10.6665f, 7.9571f, 11.0f, 7.9571f)
                curveTo(11.3335f, 7.9571f, 11.5852f, 8.1016f, 11.7612f, 8.2358f)
                curveTo(11.9113f, 8.3504f, 12.0681f, 8.5073f, 12.213f, 8.6524f)
                lineTo(12.8232f, 9.2626f)
                curveTo(12.8933f, 9.3326f, 12.9501f, 9.3894f, 13.0f, 9.4377f)
                curveTo(13.0499f, 9.3894f, 13.1067f, 9.3326f, 13.1768f, 9.2626f)
                lineTo(14.4697f, 7.9697f)
                curveTo(14.7626f, 7.6768f, 15.2374f, 7.6768f, 15.5303f, 7.9697f)
                close()
            }
        }
            .build()
        return _presentationGraph!!
    }

private var _presentationGraph: ImageVector? = null
