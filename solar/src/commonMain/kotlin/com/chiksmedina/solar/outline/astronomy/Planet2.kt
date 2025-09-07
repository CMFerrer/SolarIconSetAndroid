package com.chiksmedina.solar.outline.astronomy

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
import com.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.Planet2: ImageVector
    get() {
        if (_planet2 != null) {
            return _planet2!!
        }
        _planet2 = Builder(
            name = "Planet2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.815f, 16.2498f)
                curveTo(2.9407f, 15.8551f, 2.7227f, 15.4332f, 2.3281f, 15.3075f)
                curveTo(1.9334f, 15.1817f, 1.5115f, 15.3997f, 1.3858f, 15.7943f)
                curveTo(1.1941f, 16.3959f, 1.1737f, 17.057f, 1.535f, 17.6345f)
                curveTo(1.9879f, 18.3584f, 2.8417f, 18.641f, 3.6892f, 18.7221f)
                curveTo(4.1016f, 18.7615f, 4.4678f, 18.4593f, 4.5073f, 18.047f)
                curveTo(4.5467f, 17.6346f, 4.2445f, 17.2684f, 3.8321f, 17.2289f)
                curveTo(3.1378f, 17.1625f, 2.8837f, 16.9621f, 2.8067f, 16.8389f)
                curveTo(2.7569f, 16.7595f, 2.7049f, 16.595f, 2.815f, 16.2498f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.4854f, 18.5088f)
                curveTo(6.9979f, 18.4074f, 7.5383f, 18.2749f, 8.1004f, 18.113f)
                curveTo(7.5798f, 17.7802f, 7.1045f, 17.3827f, 6.6859f, 16.9318f)
                curveTo(6.5185f, 16.9705f, 6.3545f, 17.0056f, 6.1943f, 17.0373f)
                curveTo(5.788f, 17.1177f, 5.5237f, 17.5123f, 5.6041f, 17.9186f)
                curveTo(5.609f, 17.9431f, 5.6149f, 17.967f, 5.622f, 17.9903f)
                curveTo(5.7866f, 18.1656f, 5.9585f, 18.3341f, 6.137f, 18.4953f)
                curveTo(6.2469f, 18.5263f, 6.3657f, 18.5325f, 6.4854f, 18.5088f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.0825f, 10.4435f)
                curveTo(18.4993f, 10.9735f, 17.8133f, 11.5232f, 17.0389f, 12.075f)
                curveTo(16.7016f, 12.3153f, 16.6229f, 12.7836f, 16.8633f, 13.121f)
                curveTo(17.1036f, 13.4583f, 17.572f, 13.537f, 17.9093f, 13.2966f)
                curveTo(18.3828f, 12.9593f, 18.8291f, 12.6197f, 19.2446f, 12.281f)
                curveTo(19.2482f, 12.1878f, 19.25f, 12.0941f, 19.25f, 12.0f)
                curveTo(19.25f, 11.4657f, 19.1922f, 10.9449f, 19.0825f, 10.4435f)
                close()
                moveTo(8.1004f, 18.113f)
                curveTo(8.7368f, 17.9297f, 9.4008f, 17.7087f, 10.0832f, 17.4526f)
                curveTo(10.4709f, 17.307f, 10.6673f, 16.8746f, 10.5217f, 16.4868f)
                curveTo(10.3761f, 16.099f, 9.9438f, 15.9027f, 9.556f, 16.0483f)
                curveTo(8.5281f, 16.4341f, 7.5598f, 16.7301f, 6.6859f, 16.9318f)
                curveTo(7.1045f, 17.3827f, 7.5798f, 17.7802f, 8.1004f, 18.113f)
                close()
                moveTo(15.7506f, 14.7037f)
                curveTo(16.1061f, 14.4911f, 16.222f, 14.0306f, 16.0094f, 13.6751f)
                curveTo(15.7969f, 13.3196f, 15.3363f, 13.2037f, 14.9808f, 13.4162f)
                curveTo(14.4993f, 13.7042f, 13.9975f, 13.9878f, 13.4782f, 14.2645f)
                curveTo(12.9447f, 14.5487f, 12.4134f, 14.8146f, 11.8884f, 15.0612f)
                curveTo(11.5135f, 15.2373f, 11.3524f, 15.684f, 11.5285f, 16.0589f)
                curveTo(11.7046f, 16.4338f, 12.1513f, 16.5949f, 12.5262f, 16.4188f)
                curveTo(13.074f, 16.1615f, 13.6278f, 15.8844f, 14.1836f, 15.5883f)
                curveTo(14.7244f, 15.3002f, 15.2476f, 15.0044f, 15.7506f, 14.7037f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.75f, 12.0f)
                curveTo(4.75f, 7.9959f, 7.9959f, 4.75f, 12.0f, 4.75f)
                curveTo(15.4698f, 4.75f, 18.3702f, 7.1875f, 19.0825f, 10.4435f)
                curveTo(19.2832f, 10.2611f, 19.4718f, 10.081f, 19.6475f, 9.904f)
                curveTo(19.8649f, 9.6851f, 20.1837f, 9.6282f, 20.4537f, 9.734f)
                curveTo(20.1648f, 8.6533f, 19.6741f, 7.6551f, 19.0246f, 6.782f)
                curveTo(19.429f, 6.7364f, 19.7244f, 6.3753f, 19.6869f, 5.9681f)
                curveTo(19.649f, 5.5556f, 19.2838f, 5.252f, 18.8714f, 5.29f)
                curveTo(18.5272f, 5.3216f, 18.1657f, 5.3718f, 17.7897f, 5.4392f)
                curveTo(16.247f, 4.0768f, 14.22f, 3.25f, 12.0f, 3.25f)
                curveTo(7.1675f, 3.25f, 3.25f, 7.1675f, 3.25f, 12.0f)
                curveTo(3.25f, 12.3435f, 3.273f, 12.6824f, 3.3115f, 13.0156f)
                curveTo(2.9767f, 13.3513f, 2.6761f, 13.6843f, 2.4151f, 14.0109f)
                curveTo(2.1566f, 14.3346f, 2.2094f, 14.8065f, 2.533f, 15.065f)
                curveTo(2.8567f, 15.3236f, 3.3286f, 15.2708f, 3.5871f, 14.9472f)
                curveTo(3.626f, 14.8985f, 3.6661f, 14.8494f, 3.7075f, 14.7998f)
                curveTo(4.1131f, 16.0015f, 4.7725f, 17.0862f, 5.622f, 17.9903f)
                curveTo(5.6149f, 17.967f, 5.609f, 17.9431f, 5.6041f, 17.9186f)
                curveTo(5.5237f, 17.5123f, 5.788f, 17.1177f, 6.1943f, 17.0373f)
                curveTo(6.3545f, 17.0056f, 6.5185f, 16.9705f, 6.6859f, 16.9318f)
                curveTo(5.4846f, 15.638f, 4.75f, 13.9048f, 4.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.75f)
                curveTo(16.8325f, 20.75f, 20.75f, 16.8325f, 20.75f, 12.0f)
                curveTo(20.75f, 11.6555f, 20.7301f, 11.3157f, 20.6914f, 10.9815f)
                curveTo(20.2659f, 11.4084f, 19.7809f, 11.8439f, 19.2446f, 12.281f)
                curveTo(19.097f, 16.1548f, 15.91f, 19.25f, 12.0f, 19.25f)
                curveTo(10.5645f, 19.25f, 9.2264f, 18.8328f, 8.1004f, 18.113f)
                curveTo(7.5383f, 18.2749f, 6.9979f, 18.4074f, 6.4854f, 18.5088f)
                curveTo(6.3657f, 18.5325f, 6.2469f, 18.5263f, 6.137f, 18.4953f)
                curveTo(7.6885f, 19.8967f, 9.7446f, 20.75f, 12.0f, 20.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.6475f, 9.904f)
                curveTo(19.4718f, 10.081f, 19.2832f, 10.2611f, 19.0825f, 10.4435f)
                curveTo(19.1922f, 10.9449f, 19.25f, 11.4657f, 19.25f, 12.0f)
                curveTo(19.25f, 12.0941f, 19.2482f, 12.1878f, 19.2446f, 12.281f)
                curveTo(19.7809f, 11.8439f, 20.2659f, 11.4084f, 20.6914f, 10.9815f)
                curveTo(20.642f, 10.5556f, 20.562f, 10.139f, 20.4537f, 9.734f)
                curveTo(20.1837f, 9.6282f, 19.8649f, 9.6851f, 19.6475f, 9.904f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.9368f, 5.3789f)
                curveTo(20.5337f, 5.2834f, 20.1296f, 5.5328f, 20.0341f, 5.9358f)
                curveTo(19.9387f, 6.3389f, 20.188f, 6.743f, 20.5911f, 6.8385f)
                curveTo(20.9851f, 6.9318f, 21.1369f, 7.0709f, 21.1933f, 7.1611f)
                curveTo(21.2567f, 7.2623f, 21.3264f, 7.527f, 21.0365f, 8.109f)
                curveTo(20.8518f, 8.4798f, 21.0026f, 8.9301f, 21.3734f, 9.1147f)
                curveTo(21.7441f, 9.2994f, 22.1944f, 9.1486f, 22.3791f, 8.7778f)
                curveTo(22.7568f, 8.0197f, 22.9424f, 7.1285f, 22.465f, 6.3655f)
                curveTo(22.1208f, 5.8154f, 21.5417f, 5.5222f, 20.9368f, 5.3789f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.712f, 10.9608f)
                curveTo(21.0038f, 10.6668f, 21.0021f, 10.192f, 20.7082f, 9.9001f)
                curveTo(20.6331f, 9.8256f, 20.5463f, 9.7703f, 20.4537f, 9.734f)
                curveTo(20.562f, 10.139f, 20.642f, 10.5556f, 20.6914f, 10.9815f)
                lineTo(20.712f, 10.9608f)
                close()
            }
        }
            .build()
        return _planet2!!
    }

private var _planet2: ImageVector? = null
