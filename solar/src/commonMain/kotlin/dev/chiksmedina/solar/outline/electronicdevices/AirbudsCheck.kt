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

val ElectronicDevicesGroup.AirbudsCheck: ImageVector
    get() {
        if (_airbudsCheck != null) {
            return _airbudsCheck!!
        }
        _airbudsCheck = Builder(
            name = "AirbudsCheck", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.1104f, 2.7527f)
                curveTo(19.0599f, 2.7502f, 18.9955f, 2.75f, 18.8125f, 2.75f)
                curveTo(18.5134f, 2.75f, 18.391f, 2.7502f, 18.2915f, 2.7551f)
                curveTo(16.1082f, 2.8624f, 14.3624f, 4.6082f, 14.2551f, 6.7915f)
                curveTo(14.2502f, 6.891f, 14.25f, 7.0134f, 14.25f, 7.3125f)
                verticalLineTo(13.5f)
                curveTo(14.25f, 13.9142f, 13.9142f, 14.25f, 13.5f, 14.25f)
                curveTo(13.0858f, 14.25f, 12.75f, 13.9142f, 12.75f, 13.5f)
                verticalLineTo(7.2872f)
                curveTo(12.75f, 7.0211f, 12.75f, 6.8591f, 12.7569f, 6.7179f)
                curveTo(12.902f, 3.7641f, 15.2641f, 1.402f, 18.2179f, 1.2569f)
                curveTo(18.3591f, 1.25f, 18.5211f, 1.25f, 18.7873f, 1.25f)
                lineTo(18.8342f, 1.25f)
                curveTo(18.9874f, 1.25f, 19.0917f, 1.25f, 19.184f, 1.2545f)
                curveTo(21.1104f, 1.3492f, 22.6508f, 2.8896f, 22.7455f, 4.816f)
                curveTo(22.75f, 4.9083f, 22.75f, 5.0125f, 22.75f, 5.1657f)
                verticalLineTo(7.3f)
                curveTo(22.75f, 9.3711f, 21.0711f, 11.05f, 19.0f, 11.05f)
                curveTo(18.8619f, 11.05f, 18.75f, 11.1619f, 18.75f, 11.3f)
                verticalLineTo(11.5f)
                curveTo(18.75f, 11.9142f, 18.4142f, 12.25f, 18.0f, 12.25f)
                curveTo(17.5858f, 12.25f, 17.25f, 11.9142f, 17.25f, 11.5f)
                verticalLineTo(11.3f)
                curveTo(17.25f, 10.3335f, 18.0335f, 9.55f, 19.0f, 9.55f)
                curveTo(20.2426f, 9.55f, 21.25f, 8.5426f, 21.25f, 7.3f)
                verticalLineTo(5.1875f)
                curveTo(21.25f, 5.0045f, 21.2498f, 4.9401f, 21.2473f, 4.8896f)
                curveTo(21.1905f, 3.7338f, 20.2662f, 2.8095f, 19.1104f, 2.7527f)
                close()
                moveTo(5.1658f, 3.25f)
                lineTo(5.2128f, 3.25f)
                curveTo(5.4789f, 3.25f, 5.6409f, 3.25f, 5.7821f, 3.2569f)
                curveTo(8.7359f, 3.402f, 11.098f, 5.7641f, 11.2431f, 8.7179f)
                curveTo(11.25f, 8.8591f, 11.25f, 9.0211f, 11.25f, 9.2872f)
                verticalLineTo(19.75f)
                curveTo(11.25f, 21.4069f, 9.9069f, 22.75f, 8.25f, 22.75f)
                curveTo(6.5932f, 22.75f, 5.25f, 21.4069f, 5.25f, 19.75f)
                verticalLineTo(13.3f)
                curveTo(5.25f, 13.1619f, 5.1381f, 13.05f, 5.0f, 13.05f)
                curveTo(2.9289f, 13.05f, 1.25f, 11.3711f, 1.25f, 9.3f)
                lineTo(1.25f, 7.1658f)
                curveTo(1.25f, 7.0126f, 1.25f, 6.9083f, 1.2545f, 6.816f)
                curveTo(1.3492f, 4.8896f, 2.8896f, 3.3492f, 4.816f, 3.2545f)
                curveTo(4.9083f, 3.25f, 5.0126f, 3.25f, 5.1658f, 3.25f)
                close()
                moveTo(5.1875f, 4.75f)
                curveTo(5.0045f, 4.75f, 4.9401f, 4.7502f, 4.8896f, 4.7527f)
                curveTo(3.7338f, 4.8095f, 2.8095f, 5.7338f, 2.7527f, 6.8896f)
                curveTo(2.7502f, 6.9401f, 2.75f, 7.0045f, 2.75f, 7.1875f)
                verticalLineTo(9.3f)
                curveTo(2.75f, 10.5426f, 3.7574f, 11.55f, 5.0f, 11.55f)
                curveTo(5.9665f, 11.55f, 6.75f, 12.3335f, 6.75f, 13.3f)
                verticalLineTo(18.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(9.3125f)
                curveTo(9.75f, 9.0134f, 9.7498f, 8.891f, 9.7449f, 8.7915f)
                curveTo(9.6376f, 6.6082f, 7.8918f, 4.8624f, 5.7085f, 4.7551f)
                curveTo(5.609f, 4.7502f, 5.4866f, 4.75f, 5.1875f, 4.75f)
                close()
                moveTo(9.75f, 19.75f)
                horizontalLineTo(6.75f)
                curveTo(6.75f, 20.5784f, 7.4216f, 21.25f, 8.25f, 21.25f)
                curveTo(9.0784f, 21.25f, 9.75f, 20.5784f, 9.75f, 19.75f)
                close()
                moveTo(19.5f, 4.25f)
                curveTo(19.9142f, 4.25f, 20.25f, 4.5858f, 20.25f, 5.0f)
                verticalLineTo(7.5f)
                curveTo(20.25f, 7.9142f, 19.9142f, 8.25f, 19.5f, 8.25f)
                curveTo(19.0858f, 8.25f, 18.75f, 7.9142f, 18.75f, 7.5f)
                verticalLineTo(5.0f)
                curveTo(18.75f, 4.5858f, 19.0858f, 4.25f, 19.5f, 4.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.9142f, 6.25f, 5.25f, 6.5858f, 5.25f, 7.0f)
                verticalLineTo(9.5f)
                curveTo(5.25f, 9.9142f, 4.9142f, 10.25f, 4.5f, 10.25f)
                curveTo(4.0858f, 10.25f, 3.75f, 9.9142f, 3.75f, 9.5f)
                verticalLineTo(7.0f)
                curveTo(3.75f, 6.5858f, 4.0858f, 6.25f, 4.5f, 6.25f)
                close()
                moveTo(18.0f, 14.75f)
                curveTo(16.2051f, 14.75f, 14.75f, 16.2051f, 14.75f, 18.0f)
                curveTo(14.75f, 19.7949f, 16.2051f, 21.25f, 18.0f, 21.25f)
                curveTo(19.7949f, 21.25f, 21.25f, 19.7949f, 21.25f, 18.0f)
                curveTo(21.25f, 16.2051f, 19.7949f, 14.75f, 18.0f, 14.75f)
                close()
                moveTo(13.25f, 18.0f)
                curveTo(13.25f, 15.3766f, 15.3766f, 13.25f, 18.0f, 13.25f)
                curveTo(20.6234f, 13.25f, 22.75f, 15.3766f, 22.75f, 18.0f)
                curveTo(22.75f, 20.6234f, 20.6234f, 22.75f, 18.0f, 22.75f)
                curveTo(15.3766f, 22.75f, 13.25f, 20.6234f, 13.25f, 18.0f)
                close()
                moveTo(20.0483f, 16.4883f)
                curveTo(20.3309f, 16.7911f, 20.3146f, 17.2657f, 20.0117f, 17.5483f)
                lineTo(17.8689f, 19.5483f)
                curveTo(17.5807f, 19.8172f, 17.1336f, 19.8172f, 16.8454f, 19.5483f)
                lineTo(15.9883f, 18.7483f)
                curveTo(15.6855f, 18.4657f, 15.6691f, 17.9911f, 15.9517f, 17.6883f)
                curveTo(16.2343f, 17.3855f, 16.7089f, 17.3691f, 17.0117f, 17.6517f)
                lineTo(17.3571f, 17.9741f)
                lineTo(18.9883f, 16.4517f)
                curveTo(19.2911f, 16.1691f, 19.7657f, 16.1855f, 20.0483f, 16.4883f)
                close()
            }
        }
            .build()
        return _airbudsCheck!!
    }

private var _airbudsCheck: ImageVector? = null
