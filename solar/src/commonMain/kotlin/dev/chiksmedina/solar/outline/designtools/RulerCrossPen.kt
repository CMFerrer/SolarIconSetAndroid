package dev.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.DesignToolsGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.5866f, 3.1076f)
                curveTo(7.1892f, 3.4108f, 6.7188f, 3.8789f, 6.022f, 4.5757f)
                lineTo(4.5757f, 6.022f)
                curveTo(3.8789f, 6.7188f, 3.4108f, 7.1891f, 3.1076f, 7.5865f)
                curveTo(2.8176f, 7.9666f, 2.75f, 8.1906f, 2.75f, 8.3843f)
                curveTo(2.75f, 8.5779f, 2.8176f, 8.8019f, 3.1076f, 9.182f)
                curveTo(3.4108f, 9.5794f, 3.8789f, 10.0497f, 4.5757f, 10.7465f)
                curveTo(4.8686f, 11.0394f, 4.8686f, 11.5143f, 4.5757f, 11.8072f)
                curveTo(4.2828f, 12.1001f, 3.808f, 12.1001f, 3.5151f, 11.8072f)
                lineTo(3.4782f, 11.7703f)
                curveTo(2.8278f, 11.12f, 2.2867f, 10.5789f, 1.9151f, 10.0919f)
                curveTo(1.5233f, 9.5784f, 1.25f, 9.0378f, 1.25f, 8.3843f)
                curveTo(1.25f, 7.7307f, 1.5233f, 7.1902f, 1.9151f, 6.6767f)
                curveTo(2.2867f, 6.1896f, 2.8278f, 5.6486f, 3.4782f, 4.9982f)
                curveTo(3.4904f, 4.986f, 3.5027f, 4.9737f, 3.5151f, 4.9613f)
                lineTo(4.9614f, 3.515f)
                curveTo(4.9737f, 3.5027f, 4.986f, 3.4904f, 4.9983f, 3.4781f)
                curveTo(5.6486f, 2.8278f, 6.1897f, 2.2867f, 6.6767f, 1.9151f)
                curveTo(7.1902f, 1.5233f, 7.7308f, 1.25f, 8.3843f, 1.25f)
                curveTo(9.0378f, 1.25f, 9.5784f, 1.5233f, 10.0919f, 1.9151f)
                curveTo(10.5789f, 2.2867f, 11.12f, 2.8278f, 11.7703f, 3.4781f)
                lineTo(11.8072f, 3.515f)
                curveTo(11.9479f, 3.6557f, 12.0269f, 3.8465f, 12.0269f, 4.0454f)
                curveTo(12.0269f, 4.2443f, 11.9479f, 4.4351f, 11.8072f, 4.5757f)
                lineTo(9.3967f, 6.9862f)
                curveTo(9.1038f, 7.2791f, 8.6289f, 7.2791f, 8.3361f, 6.9862f)
                curveTo(8.0432f, 6.6933f, 8.0432f, 6.2184f, 8.3361f, 5.9255f)
                lineTo(10.215f, 4.0466f)
                curveTo(9.7941f, 3.6316f, 9.469f, 3.3266f, 9.182f, 3.1076f)
                curveTo(8.8019f, 2.8176f, 8.578f, 2.75f, 8.3843f, 2.75f)
                curveTo(8.1906f, 2.75f, 7.9666f, 2.8176f, 7.5866f, 3.1076f)
                close()
                moveTo(19.9547f, 11.9731f)
                curveTo(20.1536f, 11.9731f, 20.3443f, 12.0522f, 20.485f, 12.1928f)
                lineTo(20.5219f, 12.2297f)
                curveTo(21.1722f, 12.88f, 21.7134f, 13.4211f, 22.0849f, 13.9081f)
                curveTo(22.4767f, 14.4217f, 22.75f, 14.9622f, 22.75f, 15.6157f)
                curveTo(22.75f, 16.2693f, 22.4767f, 16.8098f, 22.0849f, 17.3233f)
                curveTo(21.7134f, 17.8104f, 21.1722f, 18.3514f, 20.5219f, 19.0018f)
                lineTo(19.0018f, 20.5219f)
                curveTo(18.3515f, 21.1722f, 17.8104f, 21.7133f, 17.3234f, 22.0849f)
                curveTo(16.8098f, 22.4767f, 16.2693f, 22.75f, 15.6158f, 22.75f)
                curveTo(14.9622f, 22.75f, 14.4217f, 22.4767f, 13.9082f, 22.0849f)
                curveTo(13.4211f, 21.7133f, 12.8801f, 21.1722f, 12.2297f, 20.5219f)
                lineTo(12.1928f, 20.485f)
                curveTo(11.8999f, 20.1921f, 11.8999f, 19.7172f, 12.1928f, 19.4243f)
                curveTo(12.4857f, 19.1314f, 12.9606f, 19.1314f, 13.2535f, 19.4243f)
                curveTo(13.9503f, 20.1211f, 14.4206f, 20.5892f, 14.818f, 20.8924f)
                curveTo(15.1981f, 21.1824f, 15.4221f, 21.25f, 15.6158f, 21.25f)
                curveTo(15.8095f, 21.25f, 16.0334f, 21.1824f, 16.4135f, 20.8924f)
                curveTo(16.8109f, 20.5892f, 17.2812f, 20.1211f, 17.978f, 19.4243f)
                lineTo(19.4243f, 17.978f)
                curveTo(20.1211f, 17.2812f, 20.5892f, 16.8109f, 20.8924f, 16.4135f)
                curveTo(21.1824f, 16.0334f, 21.25f, 15.8094f, 21.25f, 15.6157f)
                curveTo(21.25f, 15.422f, 21.1824f, 15.1981f, 20.8924f, 14.818f)
                curveTo(20.6734f, 14.531f, 20.3685f, 14.206f, 19.9534f, 13.785f)
                lineTo(18.0745f, 15.664f)
                curveTo(17.7816f, 15.9569f, 17.3067f, 15.9569f, 17.0138f, 15.664f)
                curveTo(16.7209f, 15.3711f, 16.7209f, 14.8962f, 17.0138f, 14.6033f)
                lineTo(19.4243f, 12.1928f)
                curveTo(19.565f, 12.0522f, 19.7557f, 11.9731f, 19.9547f, 11.9731f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.7566f, 2.6214f)
                curveTo(16.5852f, 0.7929f, 19.55f, 0.7929f, 21.3786f, 2.6214f)
                curveTo(23.2072f, 4.45f, 23.2072f, 7.4148f, 21.3786f, 9.2434f)
                lineTo(11.8933f, 18.7287f)
                curveTo(11.3514f, 19.2706f, 11.0323f, 19.5897f, 10.6774f, 19.8665f)
                curveTo(10.2592f, 20.1927f, 9.8066f, 20.4725f, 9.3277f, 20.7007f)
                curveTo(8.9214f, 20.8943f, 8.4933f, 21.037f, 7.7662f, 21.2793f)
                lineTo(4.4351f, 22.3897f)
                lineTo(3.633f, 22.6571f)
                curveTo(2.9825f, 22.8739f, 2.2652f, 22.7046f, 1.7803f, 22.2197f)
                curveTo(1.2954f, 21.7348f, 1.1261f, 21.0175f, 1.343f, 20.367f)
                lineTo(2.7207f, 16.2338f)
                curveTo(2.963f, 15.5067f, 3.1057f, 15.0787f, 3.2993f, 14.6724f)
                curveTo(3.5275f, 14.1935f, 3.8073f, 13.7409f, 4.1335f, 13.3226f)
                curveTo(4.4103f, 12.9677f, 4.7294f, 12.6487f, 5.2714f, 12.1067f)
                lineTo(14.7566f, 2.6214f)
                close()
                moveTo(20.3179f, 3.6821f)
                curveTo(19.0751f, 2.4393f, 17.0601f, 2.4393f, 15.8173f, 3.6821f)
                lineTo(15.1554f, 4.344f)
                curveTo(15.1896f, 4.519f, 15.2474f, 4.7568f, 15.3438f, 5.0349f)
                curveTo(15.561f, 5.6608f, 15.9712f, 6.4829f, 16.7442f, 7.2558f)
                curveTo(17.5171f, 8.0288f, 18.3392f, 8.439f, 18.9651f, 8.6562f)
                curveTo(19.2432f, 8.7527f, 19.481f, 8.8105f, 19.656f, 8.8447f)
                lineTo(20.3179f, 8.1827f)
                curveTo(21.5607f, 6.9399f, 21.5607f, 4.9249f, 20.3179f, 3.6821f)
                close()
                moveTo(18.4393f, 10.0614f)
                curveTo(17.6506f, 9.7832f, 16.6346f, 9.2676f, 15.6835f, 8.3165f)
                curveTo(14.7324f, 7.3654f, 14.2168f, 6.3494f, 13.9387f, 5.5608f)
                lineTo(6.3692f, 13.1302f)
                curveTo(5.7795f, 13.7199f, 5.5296f, 13.9716f, 5.3163f, 14.2451f)
                curveTo(5.057f, 14.5775f, 4.8348f, 14.9371f, 4.6534f, 15.3177f)
                curveTo(4.5042f, 15.6307f, 4.3908f, 15.9669f, 4.1271f, 16.758f)
                lineTo(3.1799f, 19.5995f)
                lineTo(4.4005f, 20.8201f)
                lineTo(7.242f, 19.8729f)
                curveTo(8.0331f, 19.6092f, 8.3693f, 19.4958f, 8.6823f, 19.3466f)
                curveTo(9.0629f, 19.1653f, 9.4225f, 18.943f, 9.7549f, 18.6837f)
                curveTo(10.0284f, 18.4704f, 10.2801f, 18.2205f, 10.8698f, 17.6308f)
                lineTo(18.4393f, 10.0614f)
                close()
            }
        }
            .build()
        return _rulerCrossPen!!
    }

private var _rulerCrossPen: ImageVector? = null
