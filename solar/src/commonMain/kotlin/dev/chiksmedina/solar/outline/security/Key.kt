package dev.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SecurityGroup

val SecurityGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(
            name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.681f, 5.3481f)
                curveTo(14.0522f, 5.3481f, 12.7266f, 6.6639f, 12.7266f, 8.2935f)
                curveTo(12.7266f, 9.9231f, 14.0522f, 11.2389f, 15.681f, 11.2389f)
                curveTo(17.3097f, 11.2389f, 18.6354f, 9.9231f, 18.6354f, 8.2935f)
                curveTo(18.6354f, 6.6639f, 17.3097f, 5.3481f, 15.681f, 5.3481f)
                close()
                moveTo(14.2266f, 8.2935f)
                curveTo(14.2266f, 7.4982f, 14.8748f, 6.8481f, 15.681f, 6.8481f)
                curveTo(16.4871f, 6.8481f, 17.1354f, 7.4982f, 17.1354f, 8.2935f)
                curveTo(17.1354f, 9.0889f, 16.4871f, 9.7389f, 15.681f, 9.7389f)
                curveTo(14.8748f, 9.7389f, 14.2266f, 9.0889f, 14.2266f, 8.2935f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.53f, 20.8783f)
                curveTo(9.8631f, 20.414f, 9.9702f, 19.9429f, 9.9623f, 19.5233f)
                curveTo(10.3545f, 19.6387f, 10.7425f, 19.6533f, 11.1141f, 19.5828f)
                curveTo(11.8826f, 19.437f, 12.4511f, 18.9512f, 12.7528f, 18.5507f)
                lineTo(12.7581f, 18.5437f)
                lineTo(12.7632f, 18.5366f)
                curveTo(13.2883f, 17.8043f, 13.2873f, 17.0543f, 13.1587f, 16.5164f)
                curveTo(13.0957f, 16.2528f, 13.0021f, 16.0361f, 12.9245f, 15.8846f)
                curveTo(12.8853f, 15.8081f, 12.8491f, 15.746f, 12.8208f, 15.7005f)
                curveTo(12.8133f, 15.6885f, 12.8063f, 15.6775f, 12.8f, 15.6677f)
                curveTo(12.7113f, 15.5021f, 12.6111f, 15.3719f, 12.527f, 15.2737f)
                lineTo(12.536f, 15.2647f)
                lineTo(13.0001f, 14.8024f)
                curveTo(13.3818f, 14.9849f, 13.7957f, 15.0999f, 14.1583f, 15.1749f)
                curveTo(14.7441f, 15.2962f, 15.3171f, 15.3369f, 15.6808f, 15.3369f)
                curveTo(19.5821f, 15.3369f, 22.75f, 12.1863f, 22.75f, 8.2934f)
                curveTo(22.75f, 4.4006f, 19.5821f, 1.25f, 15.6808f, 1.25f)
                curveTo(11.7794f, 1.25f, 8.6115f, 4.4006f, 8.6115f, 8.2934f)
                curveTo(8.6115f, 9.2105f, 8.8202f, 9.9959f, 9.0259f, 10.549f)
                curveTo(9.0783f, 10.6898f, 9.1309f, 10.8166f, 9.1804f, 10.9279f)
                lineTo(1.9252f, 18.1535f)
                curveTo(1.6688f, 18.4089f, 1.3679f, 18.853f, 1.277f, 19.4092f)
                curveTo(1.1784f, 20.0124f, 1.3404f, 20.6829f, 1.9252f, 21.2654f)
                lineTo(2.8069f, 22.1435f)
                curveTo(2.8205f, 22.1571f, 2.8346f, 22.1701f, 2.8492f, 22.1825f)
                curveTo(3.1039f, 22.3999f, 3.5317f, 22.6513f, 4.0458f, 22.7273f)
                curveTo(4.5972f, 22.8088f, 5.2353f, 22.6818f, 5.7758f, 22.1435f)
                lineTo(6.3424f, 21.5793f)
                curveTo(6.8753f, 21.8849f, 7.4386f, 21.9545f, 7.9595f, 21.8548f)
                curveTo(8.635f, 21.7254f, 9.1969f, 21.321f, 9.5197f, 20.8924f)
                lineTo(9.525f, 20.8854f)
                lineTo(9.53f, 20.8783f)
                close()
                moveTo(10.1115f, 8.2934f)
                curveTo(10.1115f, 5.2348f, 12.602f, 2.75f, 15.6808f, 2.75f)
                curveTo(18.7595f, 2.75f, 21.25f, 5.2348f, 21.25f, 8.2934f)
                curveTo(21.25f, 11.3521f, 18.7595f, 13.8369f, 15.6808f, 13.8369f)
                curveTo(15.4076f, 13.8369f, 14.9372f, 13.8044f, 14.4624f, 13.7061f)
                curveTo(13.9654f, 13.6032f, 13.5753f, 13.4504f, 13.3675f, 13.2779f)
                curveTo(13.0699f, 13.031f, 12.6333f, 13.0508f, 12.3593f, 13.3237f)
                lineTo(11.4775f, 14.2019f)
                curveTo(11.2758f, 14.4028f, 11.0818f, 14.6305f, 10.9795f, 14.8933f)
                curveTo(10.8499f, 15.2261f, 10.8912f, 15.5463f, 11.0395f, 15.8121f)
                curveTo(11.1274f, 15.9697f, 11.2689f, 16.1202f, 11.3279f, 16.183f)
                lineTo(11.3476f, 16.2042f)
                curveTo(11.4174f, 16.2811f, 11.4555f, 16.3314f, 11.4834f, 16.387f)
                lineTo(11.5099f, 16.4397f)
                lineTo(11.5401f, 16.4817f)
                lineTo(11.5469f, 16.4924f)
                curveTo(11.5559f, 16.507f, 11.5713f, 16.533f, 11.5895f, 16.5685f)
                curveTo(11.6267f, 16.6412f, 11.671f, 16.7445f, 11.6998f, 16.8652f)
                curveTo(11.7544f, 17.0937f, 11.7539f, 17.3656f, 11.5494f, 17.6551f)
                curveTo(11.4088f, 17.8384f, 11.1425f, 18.0506f, 10.8346f, 18.1091f)
                curveTo(10.577f, 18.1579f, 10.1571f, 18.1261f, 9.5968f, 17.5681f)
                curveTo(9.3041f, 17.2766f, 8.8309f, 17.2766f, 8.5383f, 17.5681f)
                lineTo(8.2444f, 17.8608f)
                curveTo(7.9675f, 18.1365f, 7.949f, 18.5782f, 8.2006f, 18.8761f)
                curveTo(8.202f, 18.8778f, 8.2059f, 18.8826f, 8.2117f, 18.8903f)
                curveTo(8.2237f, 18.9062f, 8.2435f, 18.9336f, 8.2669f, 18.9704f)
                curveTo(8.3149f, 19.0461f, 8.3713f, 19.1508f, 8.4114f, 19.2706f)
                curveTo(8.487f, 19.4963f, 8.4989f, 19.7374f, 8.3165f, 19.9966f)
                curveTo(8.1965f, 20.1519f, 7.9531f, 20.3287f, 7.6773f, 20.3815f)
                curveTo(7.443f, 20.4264f, 7.1429f, 20.3931f, 6.8046f, 20.0562f)
                curveTo(6.5119f, 19.7647f, 6.0387f, 19.7647f, 5.7461f, 20.0562f)
                lineTo(4.7174f, 21.0807f)
                curveTo(4.5525f, 21.2449f, 4.4069f, 21.2643f, 4.2651f, 21.2434f)
                curveTo(4.0974f, 21.2186f, 3.9334f, 21.1293f, 3.8408f, 21.0562f)
                lineTo(2.9837f, 20.2025f)
                curveTo(2.7455f, 19.9653f, 2.736f, 19.7821f, 2.7574f, 19.6511f)
                curveTo(2.7865f, 19.4731f, 2.8972f, 19.3025f, 2.9837f, 19.2163f)
                lineTo(10.6279f, 11.6033f)
                curveTo(10.8748f, 11.3575f, 10.9185f, 10.9735f, 10.7333f, 10.6784f)
                lineTo(10.7312f, 10.6748f)
                curveTo(10.7284f, 10.6703f, 10.7232f, 10.6615f, 10.7159f, 10.6487f)
                curveTo(10.7013f, 10.6231f, 10.6782f, 10.5814f, 10.6495f, 10.5251f)
                curveTo(10.5919f, 10.4123f, 10.5122f, 10.2423f, 10.4319f, 10.0262f)
                curveTo(10.2702f, 9.5913f, 10.1115f, 8.9863f, 10.1115f, 8.2934f)
                close()
                moveTo(8.2006f, 18.8761f)
                curveTo(8.202f, 18.8777f, 8.2034f, 18.8793f, 8.2048f, 18.881f)
                lineTo(8.2036f, 18.8796f)
                lineTo(8.2006f, 18.8761f)
                close()
            }
        }
            .build()
        return _key!!
    }

private var _key: ImageVector? = null
