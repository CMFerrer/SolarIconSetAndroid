package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.Devices: ImageVector
    get() {
        if (_devices != null) {
            return _devices!!
        }
        _devices = Builder(
            name = "Devices", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.9437f, 1.25f)
                horizontalLineTo(14.0565f)
                curveTo(15.8943f, 1.25f, 17.3499f, 1.25f, 18.4891f, 1.4031f)
                curveTo(19.6615f, 1.5608f, 20.6105f, 1.8929f, 21.3589f, 2.6412f)
                curveTo(22.1072f, 3.3896f, 22.4393f, 4.3386f, 22.597f, 5.511f)
                curveTo(22.7501f, 6.6502f, 22.7501f, 8.1058f, 22.7501f, 9.9436f)
                verticalLineTo(14.0564f)
                curveTo(22.7501f, 15.8942f, 22.7501f, 17.3498f, 22.597f, 18.489f)
                curveTo(22.4393f, 19.6614f, 22.1072f, 20.6104f, 21.3589f, 21.3588f)
                curveTo(20.6105f, 22.1071f, 19.6615f, 22.4392f, 18.4891f, 22.5969f)
                curveTo(17.3499f, 22.75f, 15.8943f, 22.75f, 14.0565f, 22.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                curveTo(11.25f, 21.5858f, 11.5858f, 21.25f, 12.0f, 21.25f)
                horizontalLineTo(14.0001f)
                curveTo(15.9069f, 21.25f, 17.2616f, 21.2484f, 18.2893f, 21.1102f)
                curveTo(19.2953f, 20.975f, 19.875f, 20.7213f, 20.2982f, 20.2981f)
                curveTo(20.7214f, 19.8749f, 20.9751f, 19.2952f, 21.1103f, 18.2892f)
                curveTo(21.2485f, 17.2615f, 21.2501f, 15.9068f, 21.2501f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(21.2501f, 8.0932f, 21.2485f, 6.7385f, 21.1103f, 5.7108f)
                curveTo(20.9751f, 4.7048f, 20.7214f, 4.1251f, 20.2982f, 3.7019f)
                curveTo(19.875f, 3.2787f, 19.2953f, 3.025f, 18.2893f, 2.8898f)
                curveTo(17.2616f, 2.7516f, 15.9069f, 2.75f, 14.0001f, 2.75f)
                curveTo(12.0933f, 2.75f, 10.7386f, 2.7516f, 9.7109f, 2.8898f)
                curveTo(8.7049f, 3.025f, 8.1252f, 3.2787f, 7.702f, 3.7019f)
                curveTo(7.0061f, 4.3978f, 6.7953f, 5.4792f, 6.7587f, 8.0108f)
                curveTo(6.7527f, 8.425f, 6.4121f, 8.7559f, 5.9979f, 8.7499f)
                curveTo(5.5838f, 8.7439f, 5.2529f, 8.4033f, 5.2589f, 7.9892f)
                curveTo(5.294f, 5.5617f, 5.4511f, 3.8315f, 6.6413f, 2.6412f)
                curveTo(7.3897f, 1.8929f, 8.3386f, 1.5608f, 9.5111f, 1.4031f)
                curveTo(10.6503f, 1.25f, 12.1059f, 1.25f, 13.9437f, 1.25f)
                close()
                moveTo(5.4616f, 10.25f)
                horizontalLineTo(5.5384f)
                curveTo(6.2079f, 10.25f, 6.7667f, 10.25f, 7.219f, 10.296f)
                curveTo(7.6925f, 10.3441f, 8.1318f, 10.4489f, 8.5278f, 10.7135f)
                curveTo(8.8281f, 10.9141f, 9.0859f, 11.1719f, 9.2865f, 11.4722f)
                curveTo(9.5511f, 11.8682f, 9.6559f, 12.3075f, 9.704f, 12.781f)
                curveTo(9.75f, 13.2334f, 9.75f, 13.7921f, 9.75f, 14.4617f)
                verticalLineTo(18.5383f)
                curveTo(9.75f, 19.2079f, 9.75f, 19.7666f, 9.704f, 20.219f)
                curveTo(9.6559f, 20.6925f, 9.5511f, 21.1318f, 9.2865f, 21.5278f)
                curveTo(9.0859f, 21.8281f, 8.8281f, 22.0859f, 8.5278f, 22.2865f)
                curveTo(8.1318f, 22.5511f, 7.6925f, 22.6559f, 7.219f, 22.704f)
                curveTo(6.7666f, 22.75f, 6.2079f, 22.75f, 5.5383f, 22.75f)
                horizontalLineTo(5.4617f)
                curveTo(4.7921f, 22.75f, 4.2334f, 22.75f, 3.781f, 22.704f)
                curveTo(3.3075f, 22.6559f, 2.8682f, 22.5511f, 2.4722f, 22.2865f)
                curveTo(2.1719f, 22.0859f, 1.9141f, 21.8281f, 1.7135f, 21.5278f)
                curveTo(1.4489f, 21.1318f, 1.3441f, 20.6925f, 1.296f, 20.219f)
                curveTo(1.25f, 19.7666f, 1.25f, 19.2079f, 1.25f, 18.5383f)
                verticalLineTo(14.4617f)
                curveTo(1.25f, 13.7921f, 1.25f, 13.2334f, 1.296f, 12.781f)
                curveTo(1.3441f, 12.3075f, 1.4489f, 11.8682f, 1.7135f, 11.4722f)
                curveTo(1.9141f, 11.1719f, 2.1719f, 10.9141f, 2.4722f, 10.7135f)
                curveTo(2.8682f, 10.4489f, 3.3075f, 10.3441f, 3.781f, 10.296f)
                curveTo(4.2333f, 10.25f, 4.7921f, 10.25f, 5.4616f, 10.25f)
                close()
                moveTo(3.9328f, 11.7883f)
                curveTo(3.578f, 11.8244f, 3.414f, 11.8882f, 3.3055f, 11.9607f)
                curveTo(3.169f, 12.0519f, 3.0519f, 12.1691f, 2.9607f, 12.3055f)
                curveTo(2.8882f, 12.414f, 2.8244f, 12.578f, 2.7883f, 12.9328f)
                curveTo(2.7509f, 13.3002f, 2.75f, 13.7822f, 2.75f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(2.75f, 19.2178f, 2.7509f, 19.6998f, 2.7883f, 20.0672f)
                curveTo(2.8244f, 20.422f, 2.8882f, 20.586f, 2.9607f, 20.6945f)
                curveTo(3.0519f, 20.8309f, 3.169f, 20.9481f, 3.3055f, 21.0393f)
                curveTo(3.414f, 21.1118f, 3.578f, 21.1756f, 3.9328f, 21.2117f)
                curveTo(4.3002f, 21.2491f, 4.7822f, 21.25f, 5.5f, 21.25f)
                curveTo(6.2178f, 21.25f, 6.6998f, 21.2491f, 7.0672f, 21.2117f)
                curveTo(7.422f, 21.1756f, 7.586f, 21.1118f, 7.6945f, 21.0393f)
                curveTo(7.8309f, 20.9481f, 7.9481f, 20.8309f, 8.0393f, 20.6945f)
                curveTo(8.1118f, 20.586f, 8.1756f, 20.422f, 8.2117f, 20.0672f)
                curveTo(8.2491f, 19.6998f, 8.25f, 19.2178f, 8.25f, 18.5f)
                verticalLineTo(14.5f)
                curveTo(8.25f, 13.7822f, 8.2491f, 13.3002f, 8.2117f, 12.9328f)
                curveTo(8.1756f, 12.578f, 8.1118f, 12.414f, 8.0393f, 12.3055f)
                curveTo(7.9481f, 12.1691f, 7.8309f, 12.0519f, 7.6945f, 11.9607f)
                curveTo(7.586f, 11.8882f, 7.422f, 11.8244f, 7.0672f, 11.7883f)
                curveTo(6.6998f, 11.7509f, 6.2178f, 11.75f, 5.5f, 11.75f)
                curveTo(4.7822f, 11.75f, 4.3002f, 11.7509f, 3.9328f, 11.7883f)
                close()
                moveTo(11.25f, 19.0f)
                curveTo(11.25f, 18.5858f, 11.5858f, 18.25f, 12.0f, 18.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 18.25f, 17.75f, 18.5858f, 17.75f, 19.0f)
                curveTo(17.75f, 19.4142f, 17.4142f, 19.75f, 17.0f, 19.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 19.75f, 11.25f, 19.4142f, 11.25f, 19.0f)
                close()
            }
        }
            .build()
        return _devices!!
    }

private var _devices: ImageVector? = null
