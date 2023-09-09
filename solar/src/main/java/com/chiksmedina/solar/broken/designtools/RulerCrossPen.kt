package com.chiksmedina.solar.broken.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.DesignToolsGroup

public val DesignToolsGroup.RulerCrossPen: ImageVector
    get() {
        if (_rulerCrossPen != null) {
            return _rulerCrossPen!!
        }
        _rulerCrossPen = Builder(name = "RulerCrossPen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2535f, 19.4243f)
                curveTo(12.9606f, 19.1314f, 12.4857f, 19.1314f, 12.1928f, 19.4243f)
                curveTo(11.8999f, 19.7172f, 11.8999f, 20.1921f, 12.1928f, 20.485f)
                lineTo(13.2535f, 19.4243f)
                close()
                moveTo(15.6157f, 22.0f)
                lineTo(15.6157f, 21.25f)
                lineTo(15.6157f, 22.0f)
                close()
                moveTo(4.0454f, 5.4917f)
                lineTo(4.5757f, 6.022f)
                lineTo(4.5757f, 6.022f)
                lineTo(4.0454f, 5.4917f)
                close()
                moveTo(3.515f, 11.8072f)
                curveTo(3.8079f, 12.1001f, 4.2828f, 12.1001f, 4.5757f, 11.8072f)
                curveTo(4.8686f, 11.5143f, 4.8686f, 11.0394f, 4.5757f, 10.7465f)
                lineTo(3.515f, 11.8072f)
                close()
                moveTo(11.2769f, 4.0454f)
                lineTo(11.8072f, 4.5757f)
                curveTo(11.9478f, 4.4351f, 12.0269f, 4.2443f, 12.0269f, 4.0454f)
                curveTo(12.0269f, 3.8465f, 11.9478f, 3.6557f, 11.8072f, 3.515f)
                lineTo(11.2769f, 4.0454f)
                close()
                moveTo(5.4917f, 4.0454f)
                lineTo(4.9613f, 3.515f)
                lineTo(4.9613f, 3.515f)
                lineTo(5.4917f, 4.0454f)
                close()
                moveTo(19.9546f, 12.7231f)
                lineTo(20.485f, 12.1928f)
                curveTo(20.3443f, 12.0522f, 20.1535f, 11.9731f, 19.9546f, 11.9731f)
                curveTo(19.7557f, 11.9731f, 19.565f, 12.0522f, 19.4243f, 12.1928f)
                lineTo(19.9546f, 12.7231f)
                close()
                moveTo(22.0f, 15.6157f)
                lineTo(22.75f, 15.6157f)
                lineTo(22.0f, 15.6157f)
                close()
                moveTo(8.336f, 5.9255f)
                curveTo(8.0431f, 6.2184f, 8.0431f, 6.6933f, 8.336f, 6.9862f)
                curveTo(8.6289f, 7.2791f, 9.1038f, 7.2791f, 9.3967f, 6.9862f)
                lineTo(8.336f, 5.9255f)
                close()
                moveTo(17.0138f, 14.6033f)
                curveTo(16.7209f, 14.8962f, 16.7209f, 15.3711f, 17.0138f, 15.664f)
                curveTo(17.3067f, 15.9569f, 17.7816f, 15.9569f, 18.0745f, 15.664f)
                lineTo(17.0138f, 14.6033f)
                close()
                moveTo(18.4868f, 21.0343f)
                curveTo(18.7819f, 20.7435f, 18.7854f, 20.2687f, 18.4947f, 19.9736f)
                curveTo(18.204f, 19.6786f, 17.7291f, 19.675f, 17.4341f, 19.9657f)
                lineTo(18.4868f, 21.0343f)
                close()
                moveTo(19.9274f, 17.473f)
                curveTo(19.6363f, 17.7677f, 19.6393f, 18.2426f, 19.934f, 18.5336f)
                curveTo(20.2287f, 18.8247f, 20.7036f, 18.8217f, 20.9946f, 18.527f)
                lineTo(19.9274f, 17.473f)
                close()
                moveTo(4.9613f, 3.515f)
                lineTo(3.515f, 4.9613f)
                lineTo(4.5757f, 6.022f)
                lineTo(6.022f, 4.5757f)
                lineTo(4.9613f, 3.515f)
                close()
                moveTo(12.1928f, 20.485f)
                curveTo(12.8596f, 21.1518f, 13.4119f, 21.7063f, 13.9081f, 22.0849f)
                curveTo(14.4217f, 22.4767f, 14.9622f, 22.75f, 15.6157f, 22.75f)
                lineTo(15.6157f, 21.25f)
                curveTo(15.422f, 21.25f, 15.1981f, 21.1824f, 14.818f, 20.8924f)
                curveTo(14.4206f, 20.5892f, 13.9503f, 20.1211f, 13.2535f, 19.4243f)
                lineTo(12.1928f, 20.485f)
                close()
                moveTo(3.515f, 4.9613f)
                curveTo(2.8482f, 5.6281f, 2.2937f, 6.1805f, 1.9151f, 6.6767f)
                curveTo(1.5233f, 7.1902f, 1.25f, 7.7307f, 1.25f, 8.3843f)
                lineTo(2.75f, 8.3843f)
                curveTo(2.75f, 8.1906f, 2.8176f, 7.9666f, 3.1076f, 7.5865f)
                curveTo(3.4108f, 7.1891f, 3.8789f, 6.7188f, 4.5757f, 6.022f)
                lineTo(3.515f, 4.9613f)
                close()
                moveTo(4.5757f, 10.7465f)
                curveTo(3.8789f, 10.0497f, 3.4108f, 9.5794f, 3.1076f, 9.182f)
                curveTo(2.8176f, 8.8019f, 2.75f, 8.5779f, 2.75f, 8.3843f)
                lineTo(1.25f, 8.3843f)
                curveTo(1.25f, 9.0378f, 1.5233f, 9.5784f, 1.9151f, 10.0919f)
                curveTo(2.2937f, 10.5881f, 2.8482f, 11.1404f, 3.515f, 11.8072f)
                lineTo(4.5757f, 10.7465f)
                close()
                moveTo(11.8072f, 3.515f)
                curveTo(11.1404f, 2.8482f, 10.5881f, 2.2937f, 10.0919f, 1.9151f)
                curveTo(9.5784f, 1.5233f, 9.0378f, 1.25f, 8.3843f, 1.25f)
                lineTo(8.3843f, 2.75f)
                curveTo(8.5779f, 2.75f, 8.8019f, 2.8176f, 9.182f, 3.1076f)
                curveTo(9.5794f, 3.4108f, 10.0497f, 3.8789f, 10.7465f, 4.5757f)
                lineTo(11.8072f, 3.515f)
                close()
                moveTo(6.022f, 4.5757f)
                curveTo(6.7188f, 3.8789f, 7.1891f, 3.4108f, 7.5865f, 3.1076f)
                curveTo(7.9666f, 2.8176f, 8.1906f, 2.75f, 8.3843f, 2.75f)
                lineTo(8.3843f, 1.25f)
                curveTo(7.7307f, 1.25f, 7.1902f, 1.5233f, 6.6767f, 1.9151f)
                curveTo(6.1805f, 2.2937f, 5.6281f, 2.8482f, 4.9613f, 3.515f)
                lineTo(6.022f, 4.5757f)
                close()
                moveTo(19.4243f, 13.2535f)
                curveTo(20.1211f, 13.9503f, 20.5892f, 14.4206f, 20.8924f, 14.818f)
                curveTo(21.1824f, 15.1981f, 21.25f, 15.422f, 21.25f, 15.6157f)
                lineTo(22.75f, 15.6157f)
                curveTo(22.75f, 14.9622f, 22.4767f, 14.4217f, 22.0849f, 13.9081f)
                curveTo(21.7063f, 13.4119f, 21.1518f, 12.8596f, 20.485f, 12.1928f)
                lineTo(19.4243f, 13.2535f)
                close()
                moveTo(10.7465f, 3.515f)
                lineTo(8.336f, 5.9255f)
                lineTo(9.3967f, 6.9862f)
                lineTo(11.8072f, 4.5757f)
                lineTo(10.7465f, 3.515f)
                close()
                moveTo(19.4243f, 12.1928f)
                lineTo(17.0138f, 14.6033f)
                lineTo(18.0745f, 15.664f)
                lineTo(20.485f, 13.2535f)
                lineTo(19.4243f, 12.1928f)
                close()
                moveTo(17.4341f, 19.9657f)
                curveTo(16.9239f, 20.4684f, 16.5635f, 20.7975f, 16.2586f, 21.0043f)
                curveTo(15.9715f, 21.199f, 15.784f, 21.25f, 15.6157f, 21.25f)
                lineTo(15.6157f, 22.75f)
                curveTo(16.173f, 22.75f, 16.6504f, 22.551f, 17.1005f, 22.2457f)
                curveTo(17.5329f, 21.9525f, 17.982f, 21.5316f, 18.4868f, 21.0343f)
                lineTo(17.4341f, 19.9657f)
                close()
                moveTo(20.9946f, 18.527f)
                curveTo(21.504f, 18.0112f, 21.9345f, 17.5549f, 22.2339f, 17.1178f)
                curveTo(22.5457f, 16.6628f, 22.75f, 16.1805f, 22.75f, 15.6157f)
                lineTo(21.25f, 15.6157f)
                curveTo(21.25f, 15.7859f, 21.1978f, 15.9762f, 20.9966f, 16.2699f)
                curveTo(20.783f, 16.5815f, 20.4439f, 16.9499f, 19.9274f, 17.473f)
                lineTo(20.9946f, 18.527f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.3601f, 4.0787f)
                lineTo(15.2869f, 3.1518f)
                curveTo(16.8226f, 1.6161f, 19.3125f, 1.6161f, 20.8482f, 3.1518f)
                curveTo(22.3839f, 4.6875f, 22.3839f, 7.1774f, 20.8482f, 8.7131f)
                lineTo(19.9213f, 9.6399f)
                moveTo(14.3601f, 4.0787f)
                curveTo(14.3601f, 4.0787f, 14.4759f, 6.0483f, 16.2138f, 7.7862f)
                curveTo(17.9517f, 9.5241f, 19.9213f, 9.6399f, 19.9213f, 9.6399f)
                moveTo(14.3601f, 4.0787f)
                lineTo(12.0f, 6.4387f)
                moveTo(19.9213f, 9.6399f)
                lineTo(14.6607f, 14.9006f)
                lineTo(11.5613f, 18.0f)
                lineTo(11.4001f, 18.1612f)
                curveTo(10.8229f, 18.7383f, 10.5344f, 19.0269f, 10.2162f, 19.2751f)
                curveTo(9.8408f, 19.5679f, 9.4347f, 19.8189f, 9.005f, 20.0237f)
                curveTo(8.6407f, 20.1973f, 8.2535f, 20.3263f, 7.4792f, 20.5844f)
                lineTo(4.1979f, 21.6782f)
                moveTo(4.1979f, 21.6782f)
                lineTo(3.3958f, 21.9456f)
                curveTo(3.0148f, 22.0726f, 2.5947f, 21.9734f, 2.3106f, 21.6894f)
                curveTo(2.0266f, 21.4053f, 1.9274f, 20.9852f, 2.0545f, 20.6042f)
                lineTo(2.3218f, 19.8021f)
                moveTo(4.1979f, 21.6782f)
                lineTo(2.3218f, 19.8021f)
                moveTo(2.3218f, 19.8021f)
                lineTo(3.4156f, 16.5208f)
                curveTo(3.6737f, 15.7465f, 3.8027f, 15.3593f, 3.9763f, 14.995f)
                curveTo(4.1811f, 14.5653f, 4.4321f, 14.1592f, 4.7249f, 13.7838f)
                curveTo(4.9731f, 13.4656f, 5.2617f, 13.1771f, 5.8388f, 12.5999f)
                lineTo(8.5f, 9.9387f)
            }
        }
        .build()
        return _rulerCrossPen!!
    }

private var _rulerCrossPen: ImageVector? = null