package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(
            name = "Lightning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.8f, 8.0f)
                horizontalLineTo(13.2f)
                curveTo(15.4627f, 8.0f, 16.5941f, 8.0f, 17.2971f, 8.6923f)
                curveTo(18.0f, 9.3846f, 18.0f, 10.4988f, 18.0f, 12.7273f)
                verticalLineTo(15.2727f)
                curveTo(18.0f, 17.5012f, 18.0f, 18.6154f, 17.2971f, 19.3077f)
                curveTo(16.5941f, 20.0f, 15.4627f, 20.0f, 13.2f, 20.0f)
                horizontalLineTo(10.8f)
                curveTo(8.5373f, 20.0f, 7.4059f, 20.0f, 6.7029f, 19.3077f)
                curveTo(6.0f, 18.6154f, 6.0f, 17.5012f, 6.0f, 15.2727f)
                verticalLineTo(12.7273f)
                curveTo(6.0f, 10.4988f, 6.0f, 9.3846f, 6.7029f, 8.6923f)
                curveTo(7.4059f, 8.0f, 8.5373f, 8.0f, 10.8f, 8.0f)
                close()
                moveTo(12.6f, 12.45f)
                curveTo(12.8485f, 12.1186f, 12.7814f, 11.6485f, 12.45f, 11.4f)
                curveTo(12.1186f, 11.1515f, 11.6485f, 11.2186f, 11.4f, 11.55f)
                lineTo(9.9f, 13.55f)
                curveTo(9.7296f, 13.7773f, 9.7021f, 14.0813f, 9.8292f, 14.3354f)
                curveTo(9.9562f, 14.5895f, 10.2159f, 14.75f, 10.5f, 14.75f)
                horizontalLineTo(12.0f)
                lineTo(11.4f, 15.55f)
                curveTo(11.1515f, 15.8814f, 11.2186f, 16.3515f, 11.55f, 16.6f)
                curveTo(11.8814f, 16.8485f, 12.3515f, 16.7814f, 12.6f, 16.45f)
                lineTo(14.1f, 14.45f)
                curveTo(14.2704f, 14.2227f, 14.2979f, 13.9187f, 14.1708f, 13.6646f)
                curveTo(14.0438f, 13.4105f, 13.7841f, 13.25f, 13.5f, 13.25f)
                horizontalLineTo(12.0f)
                lineTo(12.6f, 12.45f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.7327f, 7.0f)
                curveTo(9.8785f, 7.0f, 9.1318f, 6.9999f, 8.5f, 7.0479f)
                verticalLineTo(5.5f)
                curveTo(8.5f, 4.0955f, 8.5f, 3.3933f, 8.8371f, 2.8889f)
                curveTo(8.983f, 2.6705f, 9.1705f, 2.483f, 9.3889f, 2.3371f)
                curveTo(9.8933f, 2.0f, 10.5955f, 2.0f, 12.0f, 2.0f)
                curveTo(13.4045f, 2.0f, 14.1067f, 2.0f, 14.6111f, 2.3371f)
                curveTo(14.8295f, 2.483f, 15.017f, 2.6705f, 15.1629f, 2.8889f)
                curveTo(15.5f, 3.3933f, 15.5f, 4.0955f, 15.5f, 5.5f)
                verticalLineTo(7.0479f)
                curveTo(14.8682f, 6.9999f, 14.1215f, 7.0f, 13.2673f, 7.0f)
                horizontalLineTo(10.7327f)
                close()
                moveTo(11.0f, 3.75f)
                curveTo(10.5858f, 3.75f, 10.25f, 4.0858f, 10.25f, 4.5f)
                curveTo(10.25f, 4.9142f, 10.5858f, 5.25f, 11.0f, 5.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 5.25f, 13.75f, 4.9142f, 13.75f, 4.5f)
                curveTo(13.75f, 4.0858f, 13.4142f, 3.75f, 13.0f, 3.75f)
                horizontalLineTo(11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.2f, 8.0f)
                horizontalLineTo(10.8f)
                curveTo(8.5373f, 8.0f, 7.4059f, 8.0f, 6.7029f, 8.6923f)
                curveTo(6.0f, 9.3846f, 6.0f, 10.4988f, 6.0f, 12.7273f)
                verticalLineTo(15.2727f)
                curveTo(6.0f, 17.5012f, 6.0f, 18.6154f, 6.7029f, 19.3077f)
                curveTo(7.4059f, 20.0f, 8.5373f, 20.0f, 10.8f, 20.0f)
                lineTo(11.25f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(11.25f, 22.4142f, 11.5858f, 22.75f, 12.0f, 22.75f)
                curveTo(12.4142f, 22.75f, 12.75f, 22.4142f, 12.75f, 22.0f)
                verticalLineTo(20.0f)
                lineTo(13.2f, 20.0f)
                curveTo(15.4627f, 20.0f, 16.5941f, 20.0f, 17.2971f, 19.3077f)
                curveTo(18.0f, 18.6154f, 18.0f, 17.5012f, 18.0f, 15.2727f)
                verticalLineTo(12.7273f)
                curveTo(18.0f, 10.4988f, 18.0f, 9.3846f, 17.2971f, 8.6923f)
                curveTo(16.5941f, 8.0f, 15.4627f, 8.0f, 13.2f, 8.0f)
                close()
                moveTo(12.45f, 11.4f)
                curveTo(12.7814f, 11.6485f, 12.8485f, 12.1186f, 12.6f, 12.45f)
                lineTo(12.0f, 13.25f)
                horizontalLineTo(13.5f)
                curveTo(13.7841f, 13.25f, 14.0438f, 13.4105f, 14.1708f, 13.6646f)
                curveTo(14.2979f, 13.9187f, 14.2704f, 14.2227f, 14.1f, 14.45f)
                lineTo(12.6f, 16.45f)
                curveTo(12.3515f, 16.7814f, 11.8814f, 16.8485f, 11.55f, 16.6f)
                curveTo(11.2186f, 16.3515f, 11.1515f, 15.8814f, 11.4f, 15.55f)
                lineTo(12.0f, 14.75f)
                horizontalLineTo(10.5f)
                curveTo(10.2159f, 14.75f, 9.9562f, 14.5895f, 9.8292f, 14.3354f)
                curveTo(9.7021f, 14.0813f, 9.7296f, 13.7773f, 9.9f, 13.55f)
                lineTo(11.4f, 11.55f)
                curveTo(11.6485f, 11.2186f, 12.1186f, 11.1515f, 12.45f, 11.4f)
                close()
            }
        }
            .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
