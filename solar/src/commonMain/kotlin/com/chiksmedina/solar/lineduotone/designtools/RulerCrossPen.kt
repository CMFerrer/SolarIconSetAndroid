package com.chiksmedina.solar.lineduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.DesignToolsGroup

val DesignToolsGroup.RulerCrossPen: ImageVector
    get() {
        if (_rulerCrossPen != null) {
            return _rulerCrossPen!!
        }
        _rulerCrossPen = Builder(
            name = "RulerCrossPen", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.2535f, 19.4243f)
                curveTo(12.9606f, 19.1314f, 12.4857f, 19.1314f, 12.1928f, 19.4243f)
                curveTo(11.8999f, 19.7172f, 11.8999f, 20.1921f, 12.1928f, 20.485f)
                lineTo(13.2535f, 19.4243f)
                close()
                moveTo(18.5083f, 19.9546f)
                lineTo(19.0387f, 20.485f)
                lineTo(19.0387f, 20.485f)
                lineTo(18.5083f, 19.9546f)
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
                moveTo(19.9546f, 18.5083f)
                lineTo(19.4243f, 17.978f)
                lineTo(19.4243f, 17.978f)
                lineTo(19.9546f, 18.5083f)
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
                moveTo(4.9613f, 3.515f)
                lineTo(3.515f, 4.9613f)
                lineTo(4.5757f, 6.022f)
                lineTo(6.022f, 4.5757f)
                lineTo(4.9613f, 3.515f)
                close()
                moveTo(19.0387f, 20.485f)
                lineTo(20.485f, 19.0387f)
                lineTo(19.4243f, 17.978f)
                lineTo(17.978f, 19.4243f)
                lineTo(19.0387f, 20.485f)
                close()
                moveTo(12.1928f, 20.485f)
                curveTo(12.8596f, 21.1518f, 13.4119f, 21.7063f, 13.9081f, 22.0849f)
                curveTo(14.4217f, 22.4767f, 14.9622f, 22.75f, 15.6157f, 22.75f)
                lineTo(15.6157f, 21.25f)
                curveTo(15.422f, 21.25f, 15.1981f, 21.1824f, 14.818f, 20.8924f)
                curveTo(14.4206f, 20.5892f, 13.9503f, 20.1211f, 13.2535f, 19.4243f)
                lineTo(12.1928f, 20.485f)
                close()
                moveTo(17.978f, 19.4243f)
                curveTo(17.2812f, 20.1211f, 16.8109f, 20.5892f, 16.4135f, 20.8924f)
                curveTo(16.0334f, 21.1824f, 15.8094f, 21.25f, 15.6157f, 21.25f)
                lineTo(15.6157f, 22.75f)
                curveTo(16.2693f, 22.75f, 16.8098f, 22.4767f, 17.3233f, 22.0849f)
                curveTo(17.8195f, 21.7063f, 18.3719f, 21.1518f, 19.0387f, 20.485f)
                lineTo(17.978f, 19.4243f)
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
                moveTo(20.485f, 19.0387f)
                curveTo(21.1518f, 18.3719f, 21.7063f, 17.8195f, 22.0849f, 17.3233f)
                curveTo(22.4767f, 16.8098f, 22.75f, 16.2693f, 22.75f, 15.6157f)
                lineTo(21.25f, 15.6157f)
                curveTo(21.25f, 15.8094f, 21.1824f, 16.0334f, 20.8924f, 16.4135f)
                curveTo(20.5892f, 16.8109f, 20.1211f, 17.2812f, 19.4243f, 17.978f)
                lineTo(20.485f, 19.0387f)
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
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.1979f, 21.6782f)
                lineTo(5.0f, 21.4108f)
                lineTo(7.4792f, 20.5844f)
                curveTo(8.2535f, 20.3263f, 8.6407f, 20.1973f, 9.005f, 20.0237f)
                curveTo(9.4347f, 19.8189f, 9.8408f, 19.5679f, 10.2162f, 19.2751f)
                curveTo(10.5344f, 19.0269f, 10.8229f, 18.7383f, 11.4001f, 18.1612f)
                lineTo(19.9213f, 9.6399f)
                lineTo(20.8482f, 8.7131f)
                curveTo(22.3839f, 7.1774f, 22.3839f, 4.6875f, 20.8482f, 3.1518f)
                curveTo(19.3125f, 1.6161f, 16.8226f, 1.6161f, 15.2869f, 3.1518f)
                lineTo(14.3601f, 4.0787f)
                lineTo(5.8388f, 12.5999f)
                curveTo(5.2617f, 13.1771f, 4.9731f, 13.4656f, 4.7249f, 13.7838f)
                curveTo(4.4321f, 14.1592f, 4.1811f, 14.5653f, 3.9763f, 14.995f)
                curveTo(3.8027f, 15.3593f, 3.6737f, 15.7465f, 3.4156f, 16.5208f)
                lineTo(2.5892f, 19.0f)
                lineTo(2.3218f, 19.8021f)
                moveTo(4.1979f, 21.6782f)
                lineTo(3.3958f, 21.9456f)
                curveTo(3.0148f, 22.0726f, 2.5947f, 21.9734f, 2.3106f, 21.6894f)
                curveTo(2.0266f, 21.4053f, 1.9274f, 20.9852f, 2.0545f, 20.6042f)
                lineTo(2.3218f, 19.8021f)
                moveTo(4.1979f, 21.6782f)
                lineTo(2.3218f, 19.8021f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.3601f, 4.0786f)
                curveTo(14.3601f, 4.0786f, 14.476f, 6.0482f, 16.2139f, 7.7861f)
                curveTo(17.9518f, 9.524f, 19.9214f, 9.6399f, 19.9214f, 9.6399f)
            }
        }
            .build()
        return _rulerCrossPen!!
    }

private var _rulerCrossPen: ImageVector? = null
