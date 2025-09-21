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

val ElectronicDevicesGroup.MonitorSmartphone: ImageVector
    get() {
        if (_monitorSmartphone != null) {
            return _monitorSmartphone!!
        }
        _monitorSmartphone = Builder(
            name = "MonitorSmartphone", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9436f, 1.25f)
                lineTo(15.5344f, 1.25f)
                curveTo(16.6726f, 1.25f, 17.5745f, 1.25f, 18.3005f, 1.3117f)
                curveTo(19.0431f, 1.3749f, 19.6701f, 1.5067f, 20.2391f, 1.8109f)
                curveTo(21.0677f, 2.2537f, 21.7463f, 2.9323f, 22.1891f, 3.7609f)
                curveTo(22.4933f, 4.3299f, 22.6251f, 4.9569f, 22.6883f, 5.6995f)
                curveTo(22.75f, 6.4255f, 22.75f, 7.3274f, 22.75f, 8.4655f)
                verticalLineTo(8.5f)
                curveTo(22.75f, 8.9142f, 22.4142f, 9.25f, 22.0f, 9.25f)
                curveTo(21.5858f, 9.25f, 21.25f, 8.9142f, 21.25f, 8.5f)
                curveTo(21.25f, 7.3198f, 21.2494f, 6.4816f, 21.1937f, 5.8267f)
                curveTo(21.1387f, 5.181f, 21.0344f, 4.7826f, 20.8662f, 4.468f)
                curveTo(20.5632f, 3.9011f, 20.0989f, 3.4368f, 19.532f, 3.1338f)
                curveTo(19.2174f, 2.9656f, 18.819f, 2.8613f, 18.1734f, 2.8063f)
                curveTo(17.5184f, 2.7506f, 16.6802f, 2.75f, 15.5f, 2.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 2.75f, 6.7385f, 2.7516f, 5.7108f, 2.8898f)
                curveTo(4.7048f, 3.025f, 4.1251f, 3.2787f, 3.7019f, 3.7019f)
                curveTo(3.2787f, 4.1251f, 3.025f, 4.7048f, 2.8898f, 5.7108f)
                curveTo(2.7516f, 6.7385f, 2.75f, 8.0932f, 2.75f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(2.75f, 11.459f, 2.7502f, 11.8736f, 2.7537f, 12.25f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 12.25f, 11.75f, 12.5858f, 11.75f, 13.0f)
                curveTo(11.75f, 13.4142f, 11.4142f, 13.75f, 11.0f, 13.75f)
                horizontalLineTo(2.8067f)
                curveTo(2.8192f, 13.9063f, 2.8345f, 14.0533f, 2.8531f, 14.1919f)
                curveTo(2.9518f, 14.9257f, 3.1323f, 15.3142f, 3.409f, 15.591f)
                curveTo(3.6858f, 15.8678f, 4.0743f, 16.0482f, 4.8081f, 16.1469f)
                curveTo(5.5635f, 16.2484f, 6.5646f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 16.25f, 11.75f, 16.5858f, 11.75f, 17.0f)
                verticalLineTo(22.0f)
                curveTo(11.75f, 22.4142f, 11.4142f, 22.75f, 11.0f, 22.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 22.75f, 7.25f, 22.4142f, 7.25f, 22.0f)
                curveTo(7.25f, 21.5858f, 7.5858f, 21.25f, 8.0f, 21.25f)
                horizontalLineTo(10.25f)
                verticalLineTo(17.75f)
                horizontalLineTo(7.9451f)
                curveTo(6.5775f, 17.75f, 5.4752f, 17.75f, 4.6083f, 17.6335f)
                curveTo(3.7081f, 17.5125f, 2.9503f, 17.2536f, 2.3484f, 16.6517f)
                curveTo(1.7464f, 16.0497f, 1.4875f, 15.2919f, 1.3665f, 14.3918f)
                curveTo(1.3181f, 14.0312f, 1.2897f, 13.6299f, 1.2732f, 13.1858f)
                curveTo(1.258f, 13.1264f, 1.25f, 13.0641f, 1.25f, 13.0f)
                curveTo(1.25f, 12.9518f, 1.2545f, 12.9047f, 1.2632f, 12.859f)
                curveTo(1.25f, 12.3176f, 1.25f, 11.7174f, 1.25f, 11.0549f)
                lineTo(1.25f, 9.9436f)
                curveTo(1.25f, 8.1058f, 1.25f, 6.6502f, 1.4031f, 5.511f)
                curveTo(1.5608f, 4.3386f, 1.8929f, 3.3896f, 2.6412f, 2.6412f)
                curveTo(3.3896f, 1.8929f, 4.3386f, 1.5608f, 5.511f, 1.4031f)
                curveTo(6.6502f, 1.25f, 8.1058f, 1.25f, 9.9436f, 1.25f)
                close()
                moveTo(17.948f, 10.25f)
                horizontalLineTo(18.052f)
                curveTo(18.9505f, 10.25f, 19.6997f, 10.2499f, 20.2945f, 10.3299f)
                curveTo(20.9223f, 10.4143f, 21.4891f, 10.6f, 21.9445f, 11.0555f)
                curveTo(22.4f, 11.5109f, 22.5857f, 12.0777f, 22.6701f, 12.7055f)
                curveTo(22.7501f, 13.3003f, 22.75f, 14.0495f, 22.75f, 14.948f)
                verticalLineTo(18.052f)
                curveTo(22.75f, 18.9505f, 22.7501f, 19.6997f, 22.6701f, 20.2945f)
                curveTo(22.5857f, 20.9223f, 22.4f, 21.4891f, 21.9445f, 21.9445f)
                curveTo(21.4891f, 22.4f, 20.9223f, 22.5857f, 20.2945f, 22.6701f)
                curveTo(19.6997f, 22.7501f, 18.9505f, 22.75f, 18.052f, 22.75f)
                horizontalLineTo(17.948f)
                curveTo(17.0495f, 22.75f, 16.3003f, 22.7501f, 15.7055f, 22.6701f)
                curveTo(15.0777f, 22.5857f, 14.5109f, 22.4f, 14.0555f, 21.9445f)
                curveTo(13.6f, 21.4891f, 13.4143f, 20.9223f, 13.3299f, 20.2945f)
                curveTo(13.2499f, 19.6997f, 13.25f, 18.9505f, 13.25f, 18.052f)
                verticalLineTo(14.948f)
                curveTo(13.25f, 14.0495f, 13.2499f, 13.3003f, 13.3299f, 12.7055f)
                curveTo(13.4143f, 12.0777f, 13.6f, 11.5109f, 14.0555f, 11.0555f)
                curveTo(14.5109f, 10.6f, 15.0777f, 10.4143f, 15.7055f, 10.3299f)
                curveTo(16.3003f, 10.2499f, 17.0495f, 10.25f, 17.948f, 10.25f)
                close()
                moveTo(15.9054f, 11.8165f)
                curveTo(15.4439f, 11.8786f, 15.2464f, 11.9858f, 15.1161f, 12.1161f)
                curveTo(14.9858f, 12.2464f, 14.8786f, 12.4439f, 14.8165f, 12.9054f)
                curveTo(14.7516f, 13.3884f, 14.75f, 14.036f, 14.75f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(14.75f, 18.964f, 14.7516f, 19.6116f, 14.8165f, 20.0946f)
                curveTo(14.8786f, 20.5561f, 14.9858f, 20.7536f, 15.1161f, 20.8839f)
                curveTo(15.2464f, 21.0142f, 15.4439f, 21.1214f, 15.9054f, 21.1835f)
                curveTo(16.3884f, 21.2484f, 17.036f, 21.25f, 18.0f, 21.25f)
                curveTo(18.964f, 21.25f, 19.6116f, 21.2484f, 20.0946f, 21.1835f)
                curveTo(20.5561f, 21.1214f, 20.7536f, 21.0142f, 20.8839f, 20.8839f)
                curveTo(21.0142f, 20.7536f, 21.1214f, 20.5561f, 21.1835f, 20.0946f)
                curveTo(21.2484f, 19.6116f, 21.25f, 18.964f, 21.25f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(21.25f, 14.036f, 21.2484f, 13.3884f, 21.1835f, 12.9054f)
                curveTo(21.1214f, 12.4439f, 21.0142f, 12.2464f, 20.8839f, 12.1161f)
                curveTo(20.7536f, 11.9858f, 20.5561f, 11.8786f, 20.0946f, 11.8165f)
                curveTo(19.6116f, 11.7516f, 18.964f, 11.75f, 18.0f, 11.75f)
                curveTo(17.036f, 11.75f, 16.3884f, 11.7516f, 15.9054f, 11.8165f)
                close()
                moveTo(16.25f, 20.0f)
                curveTo(16.25f, 19.5858f, 16.5858f, 19.25f, 17.0f, 19.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 19.25f, 19.75f, 19.5858f, 19.75f, 20.0f)
                curveTo(19.75f, 20.4142f, 19.4142f, 20.75f, 19.0f, 20.75f)
                horizontalLineTo(17.0f)
                curveTo(16.5858f, 20.75f, 16.25f, 20.4142f, 16.25f, 20.0f)
                close()
            }
        }
            .build()
        return _monitorSmartphone!!
    }

private var _monitorSmartphone: ImageVector? = null
