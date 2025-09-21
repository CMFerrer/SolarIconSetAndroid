package dev.chiksmedina.solar.outline.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.BusinessStatisticGroup

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
                moveTo(1.25f, 2.0f)
                curveTo(1.25f, 1.5858f, 1.5858f, 1.25f, 2.0f, 1.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 1.25f, 22.75f, 1.5858f, 22.75f, 2.0f)
                curveTo(22.75f, 2.4142f, 22.4142f, 2.75f, 22.0f, 2.75f)
                horizontalLineTo(20.75f)
                verticalLineTo(10.5579f)
                curveTo(20.75f, 12.0408f, 20.75f, 13.2337f, 20.617f, 14.1715f)
                curveTo(20.4786f, 15.1472f, 20.1833f, 15.9558f, 19.5118f, 16.5924f)
                curveTo(18.8458f, 17.2237f, 18.0095f, 17.4963f, 16.9997f, 17.625f)
                curveTo(16.0187f, 17.75f, 14.7672f, 17.75f, 13.196f, 17.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(20.5365f)
                lineTo(14.3354f, 21.3292f)
                curveTo(14.7059f, 21.5144f, 14.8561f, 21.9649f, 14.6708f, 22.3354f)
                curveTo(14.4856f, 22.7059f, 14.0351f, 22.8561f, 13.6646f, 22.6708f)
                lineTo(12.0f, 21.8385f)
                lineTo(10.3354f, 22.6708f)
                curveTo(9.9649f, 22.8561f, 9.5144f, 22.7059f, 9.3292f, 22.3354f)
                curveTo(9.1439f, 21.9649f, 9.2941f, 21.5144f, 9.6646f, 21.3292f)
                lineTo(11.25f, 20.5365f)
                verticalLineTo(17.75f)
                horizontalLineTo(10.804f)
                curveTo(9.2329f, 17.75f, 7.9813f, 17.75f, 7.0002f, 17.625f)
                curveTo(5.9905f, 17.4963f, 5.1542f, 17.2237f, 4.4882f, 16.5924f)
                curveTo(3.8167f, 15.9558f, 3.5213f, 15.1472f, 3.383f, 14.1715f)
                curveTo(3.25f, 13.2337f, 3.25f, 12.0408f, 3.25f, 10.5579f)
                lineTo(3.25f, 2.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 2.75f, 1.25f, 2.4142f, 1.25f, 2.0f)
                close()
                moveTo(4.75f, 2.75f)
                verticalLineTo(10.5f)
                curveTo(4.75f, 12.0544f, 4.7518f, 13.1407f, 4.8681f, 13.9608f)
                curveTo(4.9808f, 14.7551f, 5.1876f, 15.1885f, 5.5202f, 15.5038f)
                curveTo(5.8584f, 15.8244f, 6.3323f, 16.0277f, 7.1899f, 16.137f)
                curveTo(8.0651f, 16.2486f, 9.2208f, 16.25f, 10.8571f, 16.25f)
                horizontalLineTo(13.1429f)
                curveTo(14.7792f, 16.25f, 15.9349f, 16.2486f, 16.8101f, 16.137f)
                curveTo(17.6677f, 16.0277f, 18.1415f, 15.8244f, 18.4798f, 15.5038f)
                curveTo(18.8125f, 15.1885f, 19.0193f, 14.7551f, 19.1319f, 13.9608f)
                curveTo(19.2482f, 13.1407f, 19.25f, 12.0544f, 19.25f, 10.5f)
                verticalLineTo(2.75f)
                horizontalLineTo(4.75f)
                close()
                moveTo(15.5303f, 7.9697f)
                curveTo(15.8232f, 8.2626f, 15.8232f, 8.7374f, 15.5303f, 9.0303f)
                lineTo(14.2374f, 10.3232f)
                curveTo(14.2294f, 10.3313f, 14.2212f, 10.3394f, 14.2131f, 10.3476f)
                curveTo(14.0681f, 10.4927f, 13.9113f, 10.6496f, 13.7612f, 10.7642f)
                curveTo(13.5852f, 10.8984f, 13.3335f, 11.0429f, 13.0f, 11.0429f)
                curveTo(12.6665f, 11.0429f, 12.4148f, 10.8984f, 12.2388f, 10.7642f)
                curveTo(12.0887f, 10.6496f, 11.9319f, 10.4927f, 11.7869f, 10.3476f)
                curveTo(11.7788f, 10.3394f, 11.7706f, 10.3313f, 11.7626f, 10.3232f)
                lineTo(11.1768f, 9.7374f)
                curveTo(11.1067f, 9.6674f, 11.0499f, 9.6106f, 11.0f, 9.5623f)
                curveTo(10.9501f, 9.6106f, 10.8933f, 9.6674f, 10.8232f, 9.7374f)
                lineTo(9.5303f, 11.0303f)
                curveTo(9.2374f, 11.3232f, 8.7626f, 11.3232f, 8.4697f, 11.0303f)
                curveTo(8.1768f, 10.7374f, 8.1768f, 10.2626f, 8.4697f, 9.9697f)
                lineTo(9.7626f, 8.6768f)
                curveTo(9.7706f, 8.6687f, 9.7788f, 8.6606f, 9.7869f, 8.6524f)
                curveTo(9.9319f, 8.5073f, 10.0887f, 8.3504f, 10.2388f, 8.2358f)
                curveTo(10.4148f, 8.1016f, 10.6665f, 7.9571f, 11.0f, 7.9571f)
                curveTo(11.3335f, 7.9571f, 11.5852f, 8.1016f, 11.7612f, 8.2358f)
                curveTo(11.9113f, 8.3504f, 12.0681f, 8.5073f, 12.2131f, 8.6524f)
                curveTo(12.2212f, 8.6606f, 12.2294f, 8.6687f, 12.2374f, 8.6768f)
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
