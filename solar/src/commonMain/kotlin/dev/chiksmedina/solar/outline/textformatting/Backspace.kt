package dev.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.TextFormattingGroup

val TextFormattingGroup.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(
            name = "Backspace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0303f, 8.9697f)
                curveTo(10.7374f, 8.6768f, 10.2625f, 8.6768f, 9.9697f, 8.9697f)
                curveTo(9.6768f, 9.2626f, 9.6768f, 9.7374f, 9.9697f, 10.0303f)
                lineTo(11.9393f, 12.0f)
                lineTo(9.9697f, 13.9697f)
                curveTo(9.6768f, 14.2626f, 9.6768f, 14.7374f, 9.9697f, 15.0303f)
                curveTo(10.2626f, 15.3232f, 10.7374f, 15.3232f, 11.0303f, 15.0303f)
                lineTo(13.0f, 13.0607f)
                lineTo(14.9696f, 15.0303f)
                curveTo(15.2625f, 15.3232f, 15.7374f, 15.3232f, 16.0303f, 15.0303f)
                curveTo(16.3232f, 14.7374f, 16.3232f, 14.2625f, 16.0303f, 13.9697f)
                lineTo(14.0606f, 12.0f)
                lineTo(16.0303f, 10.0304f)
                curveTo(16.3232f, 9.7375f, 16.3232f, 9.2626f, 16.0303f, 8.9697f)
                curveTo(15.7374f, 8.6768f, 15.2625f, 8.6768f, 14.9696f, 8.9697f)
                lineTo(13.0f, 10.9394f)
                lineTo(11.0303f, 8.9697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.3191f, 4.6341f)
                curveTo(20.5538f, 3.8894f, 19.5855f, 3.5596f, 18.3866f, 3.4028f)
                curveTo(17.2186f, 3.25f, 15.7251f, 3.25f, 13.8342f, 3.25f)
                horizontalLineTo(11.1058f)
                curveTo(10.0228f, 3.25f, 9.1583f, 3.25f, 8.4504f, 3.3159f)
                curveTo(7.7195f, 3.384f, 7.0998f, 3.526f, 6.5151f, 3.8413f)
                curveTo(5.9295f, 4.1572f, 5.475f, 4.5951f, 5.0258f, 5.1654f)
                curveTo(4.592f, 5.7161f, 4.1329f, 6.4309f, 3.5597f, 7.3234f)
                lineTo(2.837f, 8.4486f)
                curveTo(2.3589f, 9.193f, 1.9685f, 9.8008f, 1.7023f, 10.3305f)
                curveTo(1.4242f, 10.8839f, 1.25f, 11.411f, 1.25f, 12.0f)
                curveTo(1.25f, 12.589f, 1.4242f, 13.1161f, 1.7023f, 13.6695f)
                curveTo(1.9684f, 14.1992f, 2.3589f, 14.807f, 2.837f, 15.5514f)
                lineTo(3.5597f, 16.6766f)
                curveTo(4.1329f, 17.5691f, 4.592f, 18.2839f, 5.0258f, 18.8346f)
                curveTo(5.475f, 19.4048f, 5.9295f, 19.8428f, 6.5151f, 20.1587f)
                curveTo(7.0998f, 20.474f, 7.7195f, 20.616f, 8.4504f, 20.6841f)
                curveTo(9.1583f, 20.75f, 10.0228f, 20.75f, 11.1058f, 20.75f)
                horizontalLineTo(13.8341f)
                curveTo(15.725f, 20.75f, 17.2186f, 20.75f, 18.3866f, 20.5972f)
                curveTo(19.5855f, 20.4404f, 20.5538f, 20.1106f, 21.3191f, 19.3659f)
                curveTo(22.0872f, 18.6185f, 22.4299f, 17.6679f, 22.5924f, 16.4917f)
                curveTo(22.75f, 15.3511f, 22.75f, 13.8943f, 22.75f, 12.0577f)
                verticalLineTo(11.9422f)
                curveTo(22.75f, 10.1056f, 22.75f, 8.6488f, 22.5924f, 7.5083f)
                curveTo(22.4299f, 6.332f, 22.0872f, 5.3815f, 21.3191f, 4.6341f)
                close()
                moveTo(13.779f, 4.75f)
                curveTo(15.7373f, 4.75f, 17.1327f, 4.7515f, 18.192f, 4.8901f)
                curveTo(19.2319f, 5.0262f, 19.8343f, 5.2822f, 20.273f, 5.7091f)
                curveTo(20.7088f, 6.1332f, 20.9681f, 6.7113f, 21.1066f, 7.7136f)
                curveTo(21.2483f, 8.7396f, 21.25f, 10.0926f, 21.25f, 12.0f)
                curveTo(21.25f, 13.9074f, 21.2483f, 15.2604f, 21.1066f, 16.2864f)
                curveTo(20.9681f, 17.2887f, 20.7088f, 17.8668f, 20.273f, 18.2909f)
                curveTo(19.8343f, 18.7178f, 19.2319f, 18.9738f, 18.192f, 19.1099f)
                curveTo(17.1327f, 19.2485f, 15.7373f, 19.25f, 13.779f, 19.25f)
                horizontalLineTo(11.142f)
                curveTo(10.0146f, 19.25f, 9.2198f, 19.2493f, 8.5895f, 19.1906f)
                curveTo(7.9742f, 19.1333f, 7.5722f, 19.0246f, 7.2272f, 18.8385f)
                curveTo(6.8831f, 18.6529f, 6.5776f, 18.3806f, 6.2041f, 17.9064f)
                curveTo(5.8203f, 17.4192f, 5.3996f, 16.7657f, 4.8017f, 15.8347f)
                lineTo(4.1209f, 14.7747f)
                curveTo(3.6157f, 13.9882f, 3.269f, 13.4466f, 3.0426f, 12.996f)
                curveTo(2.8241f, 12.5611f, 2.75f, 12.2714f, 2.75f, 12.0f)
                curveTo(2.75f, 11.7286f, 2.8241f, 11.4389f, 3.0426f, 11.004f)
                curveTo(3.269f, 10.5534f, 3.6157f, 10.0118f, 4.1209f, 9.2253f)
                lineTo(4.8017f, 8.1653f)
                curveTo(5.3996f, 7.2343f, 5.8203f, 6.5808f, 6.2041f, 6.0936f)
                curveTo(6.5776f, 5.6194f, 6.8831f, 5.3471f, 7.2272f, 5.1615f)
                curveTo(7.5722f, 4.9755f, 7.9742f, 4.8667f, 8.5895f, 4.8095f)
                curveTo(9.2198f, 4.7508f, 10.0146f, 4.75f, 11.142f, 4.75f)
                lineTo(13.779f, 4.75f)
                close()
            }
        }
            .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
