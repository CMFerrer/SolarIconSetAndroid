package dev.chiksmedina.solar.bold.transportpartsservice

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.TransportPartsServiceGroup

val TransportPartsServiceGroup.GasStation: ImageVector
    get() {
        if (_gasStation != null) {
            return _gasStation!!
        }
        _gasStation = Builder(
            name = "GasStation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.75f, 2.0f)
                horizontalLineTo(9.75f)
                curveTo(12.5784f, 2.0f, 13.9926f, 2.0f, 14.8713f, 2.8787f)
                curveTo(15.75f, 3.7574f, 15.75f, 5.1716f, 15.75f, 8.0f)
                verticalLineTo(16.25f)
                horizontalLineTo(17.3214f)
                curveTo(18.5246f, 16.25f, 19.5f, 17.2254f, 19.5f, 18.4286f)
                verticalLineTo(18.5f)
                curveTo(19.5f, 18.9142f, 19.8358f, 19.25f, 20.25f, 19.25f)
                curveTo(20.6642f, 19.25f, 21.0f, 18.9142f, 21.0f, 18.5f)
                verticalLineTo(13.75f)
                lineTo(19.7757f, 13.3419f)
                curveTo(19.1631f, 13.1377f, 18.75f, 12.5645f, 18.75f, 11.9189f)
                verticalLineTo(9.5f)
                curveTo(18.75f, 8.6716f, 19.4216f, 8.0f, 20.25f, 8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.6225f)
                curveTo(21.0f, 7.4374f, 20.9997f, 7.3738f, 20.9965f, 7.3157f)
                curveTo(20.9631f, 6.7211f, 20.6953f, 6.1641f, 20.2519f, 5.7665f)
                curveTo(20.2085f, 5.7277f, 20.1591f, 5.6877f, 20.0146f, 5.5722f)
                lineTo(18.7815f, 4.5857f)
                curveTo(18.458f, 4.3269f, 18.4056f, 3.8549f, 18.6643f, 3.5315f)
                curveTo(18.9231f, 3.2081f, 19.3951f, 3.1556f, 19.7185f, 3.4144f)
                lineTo(20.9678f, 4.4138f)
                curveTo(21.0901f, 4.5116f, 21.1745f, 4.5792f, 21.2531f, 4.6496f)
                curveTo(21.9922f, 5.3121f, 22.4384f, 6.2406f, 22.4941f, 7.2316f)
                curveTo(22.5f, 7.337f, 22.5f, 7.4451f, 22.5f, 7.6018f)
                verticalLineTo(18.5f)
                curveTo(22.5f, 19.7427f, 21.4926f, 20.75f, 20.25f, 20.75f)
                curveTo(19.0074f, 20.75f, 18.0f, 19.7427f, 18.0f, 18.5f)
                verticalLineTo(18.4286f)
                curveTo(18.0f, 18.0538f, 17.6962f, 17.75f, 17.3214f, 17.75f)
                horizontalLineTo(15.75f)
                verticalLineTo(21.25f)
                horizontalLineTo(16.8734f)
                curveTo(17.2876f, 21.25f, 17.6234f, 21.5858f, 17.6234f, 22.0f)
                curveTo(17.6234f, 22.4142f, 17.2876f, 22.75f, 16.8734f, 22.75f)
                horizontalLineTo(1.75f)
                curveTo(1.3358f, 22.75f, 1.0f, 22.4142f, 1.0f, 22.0f)
                curveTo(1.0f, 21.5858f, 1.3358f, 21.25f, 1.75f, 21.25f)
                horizontalLineTo(2.75f)
                verticalLineTo(8.0f)
                curveTo(2.75f, 5.1716f, 2.75f, 3.7574f, 3.6287f, 2.8787f)
                curveTo(4.5074f, 2.0f, 5.9216f, 2.0f, 8.75f, 2.0f)
                close()
                moveTo(7.0f, 16.25f)
                curveTo(6.5858f, 16.25f, 6.25f, 16.5858f, 6.25f, 17.0f)
                curveTo(6.25f, 17.4142f, 6.5858f, 17.75f, 7.0f, 17.75f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 17.75f, 12.75f, 17.4142f, 12.75f, 17.0f)
                curveTo(12.75f, 16.5858f, 12.4142f, 16.25f, 12.0f, 16.25f)
                horizontalLineTo(7.0f)
                close()
                moveTo(11.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(7.0572f, 6.0f, 6.5858f, 6.0f, 6.2929f, 6.2929f)
                curveTo(6.0f, 6.5858f, 6.0f, 7.0572f, 6.0f, 8.0f)
                curveTo(6.0f, 8.9428f, 6.0f, 9.4142f, 6.2929f, 9.7071f)
                curveTo(6.5858f, 10.0f, 7.0572f, 10.0f, 8.0f, 10.0f)
                horizontalLineTo(11.0f)
                curveTo(11.9428f, 10.0f, 12.4142f, 10.0f, 12.7071f, 9.7071f)
                curveTo(13.0f, 9.4142f, 13.0f, 8.9428f, 13.0f, 8.0f)
                curveTo(13.0f, 7.0572f, 13.0f, 6.5858f, 12.7071f, 6.2929f)
                curveTo(12.4142f, 6.0f, 11.9428f, 6.0f, 11.0f, 6.0f)
                close()
            }
        }
            .build()
        return _gasStation!!
    }

private var _gasStation: ImageVector? = null
