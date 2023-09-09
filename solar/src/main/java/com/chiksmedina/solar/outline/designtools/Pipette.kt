package com.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.DesignToolsGroup

public val DesignToolsGroup.Pipette: ImageVector
    get() {
        if (_pipette != null) {
            return _pipette!!
        }
        _pipette = Builder(name = "Pipette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.2638f, 3.7362f)
                curveTo(18.949f, 2.4213f, 16.8171f, 2.4213f, 15.5022f, 3.7362f)
                lineTo(14.0466f, 5.1917f)
                curveTo(13.906f, 5.3324f, 13.7152f, 5.4114f, 13.5163f, 5.4114f)
                curveTo(13.3174f, 5.4114f, 13.1266f, 5.3324f, 12.986f, 5.1917f)
                lineTo(11.8943f, 4.1001f)
                curveTo(11.5843f, 3.79f, 11.0816f, 3.79f, 10.7716f, 4.1001f)
                curveTo(10.4616f, 4.4101f, 10.4616f, 4.9127f, 10.7716f, 5.2228f)
                lineTo(18.7772f, 13.2284f)
                curveTo(19.0873f, 13.5384f, 19.5899f, 13.5384f, 19.8999f, 13.2284f)
                curveTo(20.21f, 12.9184f, 20.21f, 12.4157f, 19.8999f, 12.1057f)
                lineTo(18.8083f, 11.014f)
                curveTo(18.5154f, 10.7211f, 18.5154f, 10.2462f, 18.8083f, 9.9534f)
                lineTo(20.2638f, 8.4978f)
                curveTo(21.5787f, 7.1829f, 21.5787f, 5.0511f, 20.2638f, 3.7362f)
                close()
                moveTo(14.4416f, 2.6755f)
                curveTo(16.3422f, 0.7748f, 19.4238f, 0.7748f, 21.3245f, 2.6755f)
                curveTo(23.2252f, 4.5762f, 23.2252f, 7.6578f, 21.3245f, 9.5584f)
                lineTo(20.3993f, 10.4837f)
                lineTo(20.9606f, 11.045f)
                curveTo(21.8564f, 11.9408f, 21.8564f, 13.3932f, 20.9606f, 14.2891f)
                curveTo(20.0648f, 15.1849f, 18.6124f, 15.1849f, 17.7166f, 14.2891f)
                lineTo(17.1552f, 13.7277f)
                lineTo(11.0615f, 19.8214f)
                curveTo(11.0389f, 19.844f, 11.0167f, 19.8663f, 10.9947f, 19.8883f)
                curveTo(10.6043f, 20.2792f, 10.3001f, 20.5839f, 9.9253f, 20.7825f)
                curveTo(9.6767f, 20.9142f, 9.4098f, 21.0079f, 9.1334f, 21.0603f)
                curveTo(8.7167f, 21.1393f, 8.2888f, 21.0915f, 7.7398f, 21.0301f)
                curveTo(7.7088f, 21.0266f, 7.6775f, 21.0231f, 7.6458f, 21.0196f)
                lineTo(7.1705f, 20.9668f)
                curveTo(6.9833f, 20.946f, 6.9314f, 20.9408f, 6.8852f, 20.9395f)
                curveTo(6.562f, 20.93f, 6.2468f, 21.0406f, 6.0003f, 21.2499f)
                curveTo(5.9651f, 21.2798f, 5.9278f, 21.3163f, 5.7946f, 21.4494f)
                lineTo(5.1659f, 22.0781f)
                curveTo(4.2701f, 22.974f, 2.8177f, 22.974f, 1.9219f, 22.0781f)
                curveTo(1.026f, 21.1823f, 1.026f, 19.7299f, 1.9219f, 18.8341f)
                lineTo(2.5506f, 18.2054f)
                curveTo(2.6838f, 18.0722f, 2.7202f, 18.0349f, 2.7501f, 17.9997f)
                curveTo(2.9594f, 17.7532f, 3.07f, 17.438f, 3.0605f, 17.1148f)
                curveTo(3.0592f, 17.0686f, 3.054f, 17.0167f, 3.0332f, 16.8295f)
                lineTo(2.9804f, 16.3542f)
                curveTo(2.9769f, 16.3225f, 2.9734f, 16.2911f, 2.9699f, 16.2602f)
                curveTo(2.9085f, 15.7112f, 2.8607f, 15.2833f, 2.9397f, 14.8665f)
                curveTo(2.9921f, 14.5902f, 3.0858f, 14.3233f, 3.2175f, 14.0747f)
                curveTo(3.4161f, 13.6999f, 3.7207f, 13.3957f, 4.1116f, 13.0054f)
                curveTo(4.1337f, 12.9834f, 4.156f, 12.9611f, 4.1786f, 12.9385f)
                lineTo(10.2723f, 6.8448f)
                lineTo(9.7109f, 6.2834f)
                curveTo(8.8151f, 5.3876f, 8.8151f, 3.9352f, 9.7109f, 3.0394f)
                curveTo(10.6068f, 2.1436f, 12.0592f, 2.1436f, 12.955f, 3.0394f)
                lineTo(13.5163f, 3.6007f)
                lineTo(14.4416f, 2.6755f)
                close()
                moveTo(11.333f, 7.9054f)
                lineTo(5.2392f, 13.9992f)
                curveTo(4.7504f, 14.488f, 4.6225f, 14.6269f, 4.5429f, 14.7771f)
                curveTo(4.4815f, 14.8929f, 4.4379f, 15.0173f, 4.4134f, 15.146f)
                curveTo(4.3818f, 15.3131f, 4.3949f, 15.5014f, 4.4712f, 16.1885f)
                lineTo(4.5269f, 16.6895f)
                curveTo(4.5436f, 16.8395f, 4.5565f, 16.9559f, 4.5599f, 17.0711f)
                curveTo(4.5801f, 17.7648f, 4.3428f, 18.4414f, 3.8936f, 18.9705f)
                curveTo(3.819f, 19.0583f, 3.7362f, 19.1411f, 3.6295f, 19.2478f)
                lineTo(3.6112f, 19.2661f)
                lineTo(2.9825f, 19.8948f)
                curveTo(2.6725f, 20.2048f, 2.6725f, 20.7075f, 2.9825f, 21.0175f)
                curveTo(3.2925f, 21.3275f, 3.7952f, 21.3275f, 4.1052f, 21.0175f)
                lineTo(4.7522f, 20.3705f)
                curveTo(4.8589f, 20.2638f, 4.9417f, 20.1809f, 5.0295f, 20.1064f)
                curveTo(5.5586f, 19.6572f, 6.2352f, 19.4199f, 6.9289f, 19.4401f)
                curveTo(7.0441f, 19.4435f, 7.1605f, 19.4564f, 7.3105f, 19.4731f)
                lineTo(7.8115f, 19.5288f)
                curveTo(8.4986f, 19.6051f, 8.6869f, 19.6182f, 8.854f, 19.5866f)
                curveTo(8.9827f, 19.5621f, 9.1071f, 19.5185f, 9.2229f, 19.4571f)
                curveTo(9.3731f, 19.3775f, 9.512f, 19.2496f, 10.0008f, 18.7608f)
                lineTo(11.4393f, 17.3223f)
                lineTo(10.1162f, 15.9992f)
                curveTo(9.8233f, 15.7063f, 9.8233f, 15.2314f, 10.1162f, 14.9385f)
                curveTo(10.4091f, 14.6456f, 10.884f, 14.6456f, 11.1769f, 14.9385f)
                lineTo(12.5f, 16.2616f)
                lineTo(13.4393f, 15.3223f)
                lineTo(12.1162f, 13.9992f)
                curveTo(11.8233f, 13.7063f, 11.8233f, 13.2314f, 12.1162f, 12.9385f)
                curveTo(12.4091f, 12.6456f, 12.884f, 12.6456f, 13.1769f, 12.9385f)
                lineTo(14.5f, 14.2616f)
                lineTo(16.0946f, 12.667f)
                lineTo(11.333f, 7.9054f)
                close()
            }
        }
        .build()
        return _pipette!!
    }

private var _pipette: ImageVector? = null
