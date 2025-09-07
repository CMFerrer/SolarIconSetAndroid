package com.chiksmedina.solar.boldduotone.essentionalui

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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Glasses: ImageVector
    get() {
        if (_glasses != null) {
            return _glasses!!
        }
        _glasses = Builder(
            name = "Glasses", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.7115f, 3.763f)
                curveTo(6.8425f, 4.156f, 6.6301f, 4.5807f, 6.2372f, 4.7117f)
                lineTo(5.719f, 4.8844f)
                curveTo(5.1016f, 5.0902f, 4.6949f, 5.2269f, 4.3926f, 5.365f)
                curveTo(4.1068f, 5.4956f, 3.9786f, 5.6003f, 3.8935f, 5.7078f)
                curveTo(3.8083f, 5.8154f, 3.7358f, 5.9641f, 3.6741f, 6.2723f)
                curveTo(3.6088f, 6.5981f, 3.569f, 7.0254f, 3.5101f, 7.6734f)
                lineTo(3.1431f, 11.7102f)
                lineTo(3.0947f, 12.242f)
                curveTo(3.8979f, 11.6202f, 4.9057f, 11.2502f, 6.0f, 11.2502f)
                curveTo(8.3451f, 11.2502f, 10.2933f, 12.9497f, 10.6802f, 15.1842f)
                curveTo(11.1112f, 15.0595f, 11.5556f, 14.9971f, 12.0f, 14.9971f)
                verticalLineTo(16.4971f)
                curveTo(11.6305f, 16.4971f, 11.261f, 16.5601f, 10.9079f, 16.6861f)
                lineTo(10.6889f, 16.7643f)
                curveTo(10.3234f, 19.0244f, 8.3632f, 20.7502f, 6.0f, 20.7502f)
                curveTo(3.38f, 20.7502f, 1.2554f, 18.6109f, 1.25f, 15.9922f)
                curveTo(1.2505f, 15.7114f, 1.2753f, 15.4364f, 1.3225f, 15.1691f)
                lineTo(2.0197f, 7.4992f)
                curveTo(2.0742f, 6.8999f, 2.1203f, 6.3919f, 2.2033f, 5.9777f)
                curveTo(2.2915f, 5.537f, 2.4327f, 5.1362f, 2.7176f, 4.7765f)
                curveTo(3.0024f, 4.4169f, 3.3603f, 4.1876f, 3.7691f, 4.0008f)
                curveTo(4.1532f, 3.8252f, 4.6371f, 3.6639f, 5.208f, 3.4736f)
                lineTo(5.7628f, 3.2887f)
                curveTo(6.1558f, 3.1577f, 6.5805f, 3.3701f, 6.7115f, 3.763f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.9052f, 12.242f)
                curveTo(20.1021f, 11.6202f, 19.0943f, 11.2502f, 18.0f, 11.2502f)
                curveTo(15.6549f, 11.2502f, 13.7067f, 12.9497f, 13.3198f, 15.1842f)
                curveTo(12.8888f, 15.0595f, 12.4444f, 14.9972f, 12.0f, 14.9971f)
                verticalLineTo(16.4971f)
                curveTo(12.3695f, 16.4971f, 12.739f, 16.5601f, 13.0921f, 16.6861f)
                lineTo(13.3111f, 16.7643f)
                curveTo(13.6766f, 19.0244f, 15.6367f, 20.7502f, 18.0f, 20.7502f)
                curveTo(20.62f, 20.7502f, 22.7445f, 18.6109f, 22.75f, 15.9922f)
                curveTo(22.7495f, 15.7114f, 22.7247f, 15.4364f, 22.6775f, 15.1691f)
                lineTo(21.9803f, 7.4992f)
                curveTo(21.9258f, 6.8999f, 21.8796f, 6.3919f, 21.7967f, 5.9777f)
                curveTo(21.7084f, 5.537f, 21.5672f, 5.1362f, 21.2824f, 4.7765f)
                curveTo(20.9975f, 4.4169f, 20.6397f, 4.1876f, 20.2309f, 4.0008f)
                curveTo(19.8468f, 3.8252f, 19.3629f, 3.6639f, 18.792f, 3.4736f)
                lineTo(18.2372f, 3.2887f)
                curveTo(17.8442f, 3.1577f, 17.4195f, 3.3701f, 17.2885f, 3.763f)
                curveTo(17.1575f, 4.156f, 17.3699f, 4.5807f, 17.7628f, 4.7117f)
                lineTo(18.281f, 4.8844f)
                curveTo(18.8984f, 5.0902f, 19.3051f, 5.2269f, 19.6073f, 5.365f)
                curveTo(19.8931f, 5.4956f, 20.0214f, 5.6003f, 20.1065f, 5.7078f)
                curveTo(20.1917f, 5.8154f, 20.2642f, 5.9641f, 20.3259f, 6.2723f)
                curveTo(20.3912f, 6.5981f, 20.431f, 7.0254f, 20.4899f, 7.6734f)
                lineTo(20.9052f, 12.242f)
                close()
            }
        }
            .build()
        return _glasses!!
    }

private var _glasses: ImageVector? = null
