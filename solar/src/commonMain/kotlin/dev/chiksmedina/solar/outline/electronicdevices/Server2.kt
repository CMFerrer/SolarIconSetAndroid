package dev.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.Server2: ImageVector
    get() {
        if (_server2 != null) {
            return _server2!!
        }
        _server2 = Builder(
            name = "Server2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.948f, 1.25f)
                horizontalLineTo(18.052f)
                curveTo(18.9505f, 1.25f, 19.6997f, 1.25f, 20.2945f, 1.3299f)
                curveTo(20.9223f, 1.4143f, 21.4891f, 1.6f, 21.9445f, 2.0555f)
                curveTo(22.4f, 2.5109f, 22.5857f, 3.0777f, 22.6701f, 3.7055f)
                curveTo(22.7501f, 4.3003f, 22.75f, 5.0495f, 22.75f, 5.948f)
                verticalLineTo(6.052f)
                curveTo(22.75f, 6.9505f, 22.7501f, 7.6997f, 22.6701f, 8.2945f)
                curveTo(22.5857f, 8.9223f, 22.4f, 9.4891f, 21.9445f, 9.9445f)
                curveTo(21.4891f, 10.4f, 20.9223f, 10.5857f, 20.2945f, 10.6701f)
                curveTo(19.6997f, 10.7501f, 18.9505f, 10.75f, 18.052f, 10.75f)
                horizontalLineTo(5.948f)
                curveTo(5.0495f, 10.75f, 4.3003f, 10.7501f, 3.7055f, 10.6701f)
                curveTo(3.0777f, 10.5857f, 2.5109f, 10.4f, 2.0555f, 9.9445f)
                curveTo(1.6f, 9.4891f, 1.4143f, 8.9223f, 1.3299f, 8.2945f)
                curveTo(1.25f, 7.6997f, 1.25f, 6.9505f, 1.25f, 6.052f)
                verticalLineTo(5.948f)
                curveTo(1.25f, 5.0495f, 1.25f, 4.3003f, 1.3299f, 3.7055f)
                curveTo(1.4143f, 3.0777f, 1.6f, 2.5109f, 2.0555f, 2.0555f)
                curveTo(2.5109f, 1.6f, 3.0777f, 1.4143f, 3.7055f, 1.3299f)
                curveTo(4.3003f, 1.25f, 5.0495f, 1.25f, 5.948f, 1.25f)
                close()
                moveTo(3.9054f, 2.8165f)
                curveTo(3.4439f, 2.8786f, 3.2464f, 2.9858f, 3.1161f, 3.1161f)
                curveTo(2.9858f, 3.2464f, 2.8786f, 3.4439f, 2.8165f, 3.9054f)
                curveTo(2.7516f, 4.3884f, 2.75f, 5.036f, 2.75f, 6.0f)
                curveTo(2.75f, 6.964f, 2.7516f, 7.6116f, 2.8165f, 8.0946f)
                curveTo(2.8786f, 8.5561f, 2.9858f, 8.7536f, 3.1161f, 8.8839f)
                curveTo(3.2464f, 9.0142f, 3.4439f, 9.1214f, 3.9054f, 9.1835f)
                curveTo(4.3884f, 9.2484f, 5.036f, 9.25f, 6.0f, 9.25f)
                horizontalLineTo(18.0f)
                curveTo(18.964f, 9.25f, 19.6116f, 9.2484f, 20.0946f, 9.1835f)
                curveTo(20.5561f, 9.1214f, 20.7536f, 9.0142f, 20.8839f, 8.8839f)
                curveTo(21.0142f, 8.7536f, 21.1214f, 8.5561f, 21.1835f, 8.0946f)
                curveTo(21.2484f, 7.6116f, 21.25f, 6.964f, 21.25f, 6.0f)
                curveTo(21.25f, 5.036f, 21.2484f, 4.3884f, 21.1835f, 3.9054f)
                curveTo(21.1214f, 3.4439f, 21.0142f, 3.2464f, 20.8839f, 3.1161f)
                curveTo(20.7536f, 2.9858f, 20.5561f, 2.8786f, 20.0946f, 2.8165f)
                curveTo(19.6116f, 2.7516f, 18.964f, 2.75f, 18.0f, 2.75f)
                horizontalLineTo(6.0f)
                curveTo(5.036f, 2.75f, 4.3884f, 2.7516f, 3.9054f, 2.8165f)
                close()
                moveTo(6.0f, 4.25f)
                curveTo(6.4142f, 4.25f, 6.75f, 4.5858f, 6.75f, 5.0f)
                verticalLineTo(7.0f)
                curveTo(6.75f, 7.4142f, 6.4142f, 7.75f, 6.0f, 7.75f)
                curveTo(5.5858f, 7.75f, 5.25f, 7.4142f, 5.25f, 7.0f)
                verticalLineTo(5.0f)
                curveTo(5.25f, 4.5858f, 5.5858f, 4.25f, 6.0f, 4.25f)
                close()
                moveTo(9.0f, 4.25f)
                curveTo(9.4142f, 4.25f, 9.75f, 4.5858f, 9.75f, 5.0f)
                verticalLineTo(7.0f)
                curveTo(9.75f, 7.4142f, 9.4142f, 7.75f, 9.0f, 7.75f)
                curveTo(8.5858f, 7.75f, 8.25f, 7.4142f, 8.25f, 7.0f)
                verticalLineTo(5.0f)
                curveTo(8.25f, 4.5858f, 8.5858f, 4.25f, 9.0f, 4.25f)
                close()
                moveTo(12.75f, 6.0f)
                curveTo(12.75f, 5.5858f, 13.0858f, 5.25f, 13.5f, 5.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 5.25f, 18.75f, 5.5858f, 18.75f, 6.0f)
                curveTo(18.75f, 6.4142f, 18.4142f, 6.75f, 18.0f, 6.75f)
                horizontalLineTo(13.5f)
                curveTo(13.0858f, 6.75f, 12.75f, 6.4142f, 12.75f, 6.0f)
                close()
                moveTo(5.948f, 12.25f)
                horizontalLineTo(18.052f)
                curveTo(18.9505f, 12.25f, 19.6997f, 12.2499f, 20.2945f, 12.3299f)
                curveTo(20.9223f, 12.4143f, 21.4891f, 12.6f, 21.9445f, 13.0555f)
                curveTo(22.4f, 13.5109f, 22.5857f, 14.0777f, 22.6701f, 14.7055f)
                curveTo(22.7501f, 15.3003f, 22.75f, 16.0495f, 22.75f, 16.948f)
                verticalLineTo(17.052f)
                curveTo(22.75f, 17.9505f, 22.7501f, 18.6997f, 22.6701f, 19.2945f)
                curveTo(22.5857f, 19.9223f, 22.4f, 20.4891f, 21.9445f, 20.9445f)
                curveTo(21.4891f, 21.4f, 20.9223f, 21.5857f, 20.2945f, 21.6701f)
                curveTo(19.6997f, 21.7501f, 18.9505f, 21.75f, 18.052f, 21.75f)
                horizontalLineTo(5.948f)
                curveTo(5.0495f, 21.75f, 4.3003f, 21.7501f, 3.7055f, 21.6701f)
                curveTo(3.0777f, 21.5857f, 2.5109f, 21.4f, 2.0555f, 20.9445f)
                curveTo(1.6f, 20.4891f, 1.4143f, 19.9223f, 1.3299f, 19.2945f)
                curveTo(1.25f, 18.6997f, 1.25f, 17.9505f, 1.25f, 17.052f)
                verticalLineTo(16.948f)
                curveTo(1.25f, 16.0495f, 1.25f, 15.3003f, 1.3299f, 14.7055f)
                curveTo(1.4143f, 14.0777f, 1.6f, 13.5109f, 2.0555f, 13.0555f)
                curveTo(2.5109f, 12.6f, 3.0777f, 12.4143f, 3.7055f, 12.3299f)
                curveTo(4.3003f, 12.2499f, 5.0495f, 12.25f, 5.948f, 12.25f)
                close()
                moveTo(3.9054f, 13.8165f)
                curveTo(3.4439f, 13.8786f, 3.2464f, 13.9858f, 3.1161f, 14.1161f)
                curveTo(2.9858f, 14.2464f, 2.8786f, 14.4439f, 2.8165f, 14.9054f)
                curveTo(2.7516f, 15.3884f, 2.75f, 16.036f, 2.75f, 17.0f)
                curveTo(2.75f, 17.964f, 2.7516f, 18.6116f, 2.8165f, 19.0946f)
                curveTo(2.8786f, 19.5561f, 2.9858f, 19.7536f, 3.1161f, 19.8839f)
                curveTo(3.2464f, 20.0142f, 3.4439f, 20.1214f, 3.9054f, 20.1835f)
                curveTo(4.3884f, 20.2484f, 5.036f, 20.25f, 6.0f, 20.25f)
                horizontalLineTo(18.0f)
                curveTo(18.964f, 20.25f, 19.6116f, 20.2484f, 20.0946f, 20.1835f)
                curveTo(20.5561f, 20.1214f, 20.7536f, 20.0142f, 20.8839f, 19.8839f)
                curveTo(21.0142f, 19.7536f, 21.1214f, 19.5561f, 21.1835f, 19.0946f)
                curveTo(21.2484f, 18.6116f, 21.25f, 17.964f, 21.25f, 17.0f)
                curveTo(21.25f, 16.036f, 21.2484f, 15.3884f, 21.1835f, 14.9054f)
                curveTo(21.1214f, 14.4439f, 21.0142f, 14.2464f, 20.8839f, 14.1161f)
                curveTo(20.7536f, 13.9858f, 20.5561f, 13.8786f, 20.0946f, 13.8165f)
                curveTo(19.6116f, 13.7516f, 18.964f, 13.75f, 18.0f, 13.75f)
                horizontalLineTo(6.0f)
                curveTo(5.036f, 13.75f, 4.3884f, 13.7516f, 3.9054f, 13.8165f)
                close()
                moveTo(6.0f, 15.25f)
                curveTo(6.4142f, 15.25f, 6.75f, 15.5858f, 6.75f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(6.75f, 18.4142f, 6.4142f, 18.75f, 6.0f, 18.75f)
                curveTo(5.5858f, 18.75f, 5.25f, 18.4142f, 5.25f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(5.25f, 15.5858f, 5.5858f, 15.25f, 6.0f, 15.25f)
                close()
                moveTo(9.0f, 15.25f)
                curveTo(9.4142f, 15.25f, 9.75f, 15.5858f, 9.75f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(9.75f, 18.4142f, 9.4142f, 18.75f, 9.0f, 18.75f)
                curveTo(8.5858f, 18.75f, 8.25f, 18.4142f, 8.25f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(8.25f, 15.5858f, 8.5858f, 15.25f, 9.0f, 15.25f)
                close()
                moveTo(12.75f, 17.0f)
                curveTo(12.75f, 16.5858f, 13.0858f, 16.25f, 13.5f, 16.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 16.25f, 18.75f, 16.5858f, 18.75f, 17.0f)
                curveTo(18.75f, 17.4142f, 18.4142f, 17.75f, 18.0f, 17.75f)
                horizontalLineTo(13.5f)
                curveTo(13.0858f, 17.75f, 12.75f, 17.4142f, 12.75f, 17.0f)
                close()
            }
        }
            .build()
        return _server2!!
    }

private var _server2: ImageVector? = null
