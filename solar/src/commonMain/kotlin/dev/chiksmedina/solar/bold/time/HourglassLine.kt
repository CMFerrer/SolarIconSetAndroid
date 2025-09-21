package dev.chiksmedina.solar.bold.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.TimeGroup

val TimeGroup.HourglassLine: ImageVector
    get() {
        if (_hourglassLine != null) {
            return _hourglassLine!!
        }
        _hourglassLine = Builder(
            name = "HourglassLine", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.1982f, 3.2992f)
                curveTo(5.8005f, 2.0f, 7.867f, 2.0f, 12.0f, 2.0f)
                curveTo(16.133f, 2.0f, 18.1995f, 2.0f, 18.8017f, 3.2992f)
                curveTo(18.8535f, 3.4109f, 18.8972f, 3.5269f, 18.9323f, 3.6461f)
                curveTo(19.3414f, 5.0333f, 17.8802f, 6.6411f, 14.9577f, 9.8567f)
                lineTo(13.0f, 12.0f)
                lineTo(14.9577f, 14.1433f)
                curveTo(17.8802f, 17.3589f, 19.3414f, 18.9667f, 18.9323f, 20.3539f)
                curveTo(18.8972f, 20.4731f, 18.8535f, 20.5891f, 18.8017f, 20.7008f)
                curveTo(18.1995f, 22.0f, 16.133f, 22.0f, 12.0f, 22.0f)
                curveTo(7.867f, 22.0f, 5.8005f, 22.0f, 5.1982f, 20.7008f)
                curveTo(5.1465f, 20.5891f, 5.1028f, 20.4731f, 5.0676f, 20.3539f)
                curveTo(4.6586f, 18.9667f, 6.1198f, 17.3589f, 9.0423f, 14.1433f)
                lineTo(11.0f, 12.0f)
                lineTo(9.0423f, 9.8567f)
                curveTo(6.1198f, 6.6411f, 4.6586f, 5.0333f, 5.0676f, 3.6461f)
                curveTo(5.1028f, 3.5269f, 5.1465f, 3.4109f, 5.1982f, 3.2992f)
                close()
                moveTo(10.0f, 17.75f)
                curveTo(9.5858f, 17.75f, 9.25f, 18.0858f, 9.25f, 18.5f)
                curveTo(9.25f, 18.9142f, 9.5858f, 19.25f, 10.0f, 19.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 19.25f, 14.75f, 18.9142f, 14.75f, 18.5f)
                curveTo(14.75f, 18.0858f, 14.4142f, 17.75f, 14.0f, 17.75f)
                horizontalLineTo(10.0f)
                close()
                moveTo(9.25f, 5.5f)
                curveTo(9.25f, 5.0858f, 9.5858f, 4.75f, 10.0f, 4.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 4.75f, 14.75f, 5.0858f, 14.75f, 5.5f)
                curveTo(14.75f, 5.9142f, 14.4142f, 6.25f, 14.0f, 6.25f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 6.25f, 9.25f, 5.9142f, 9.25f, 5.5f)
                close()
            }
        }
            .build()
        return _hourglassLine!!
    }

private var _hourglassLine: ImageVector? = null
