package com.chiksmedina.solar.boldduotone.sports

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
import com.chiksmedina.solar.boldduotone.SportsGroup

val SportsGroup.Balls: ImageVector
    get() {
        if (_balls != null) {
            return _balls!!
        }
        _balls = Builder(
            name = "Balls", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.2764f, 2.0459f)
                curveTo(11.2366f, 2.2835f, 13.0651f, 3.408f, 14.1283f, 5.2497f)
                curveTo(14.6689f, 6.186f, 14.9501f, 7.201f, 14.9941f, 8.2113f)
                curveTo(14.0074f, 8.3786f, 13.0217f, 8.6609f, 12.1258f, 9.1119f)
                curveTo(11.6667f, 8.5953f, 11.1913f, 7.9628f, 10.7508f, 7.1999f)
                curveTo(9.1258f, 4.3853f, 9.2764f, 2.0459f, 9.2764f, 2.0459f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.2167f, 12.2881f)
                lineTo(3.1887f, 12.2486f)
                curveTo(3.0761f, 12.0887f, 2.9697f, 11.9223f, 2.87f, 11.7497f)
                curveTo(1.7708f, 9.8458f, 1.7442f, 7.617f, 2.6027f, 5.7629f)
                curveTo(3.2634f, 6.2321f, 4.9651f, 7.5788f, 6.2475f, 9.7999f)
                curveTo(6.3491f, 9.9759f, 6.4437f, 10.1499f, 6.5318f, 10.3216f)
                curveTo(6.614f, 10.4816f, 6.6905f, 10.6396f, 6.7618f, 10.7952f)
                curveTo(6.8291f, 10.9421f, 6.8917f, 11.0868f, 6.95f, 11.2292f)
                curveTo(7.0071f, 11.3688f, 7.0601f, 11.5061f, 7.1093f, 11.6408f)
                curveTo(7.802f, 13.54f, 7.7241f, 14.9176f, 7.7219f, 14.9537f)
                curveTo(6.5167f, 14.8076f, 5.3612f, 14.326f, 4.4028f, 13.5488f)
                curveTo(4.3464f, 13.503f, 4.2906f, 13.4562f, 4.2356f, 13.4084f)
                curveTo(4.0302f, 13.23f, 3.8347f, 13.0373f, 3.6507f, 12.8309f)
                curveTo(3.4978f, 12.6594f, 3.3528f, 12.4784f, 3.2167f, 12.2881f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0194f, 8.0762f)
                curveTo(14.001f, 8.2704f, 11.8559f, 8.8756f, 10.3658f, 10.3658f)
                curveTo(8.8756f, 11.8559f, 8.2704f, 14.001f, 8.0762f, 16.0194f)
                lineTo(13.9793f, 21.9225f)
                curveTo(15.9977f, 21.7283f, 18.1427f, 21.123f, 19.6329f, 19.6329f)
                curveTo(21.123f, 18.1427f, 21.7283f, 15.9977f, 21.9225f, 13.9793f)
                lineTo(16.0194f, 8.0762f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.2489f, 2.87f)
                curveTo(6.5162f, 2.1383f, 7.9274f, 1.8819f, 9.2762f, 2.0454f)
                curveTo(9.2762f, 2.0454f, 9.1256f, 4.3848f, 10.7506f, 7.1994f)
                curveTo(11.1912f, 7.9625f, 11.6668f, 8.5951f, 12.126f, 9.1118f)
                curveTo(11.4819f, 9.436f, 10.8842f, 9.8474f, 10.3658f, 10.3658f)
                curveTo(9.1263f, 11.6053f, 8.499f, 13.2979f, 8.2113f, 14.9939f)
                curveTo(8.0474f, 14.9865f, 7.8841f, 14.9729f, 7.7217f, 14.9532f)
                curveTo(7.7235f, 14.9234f, 7.8034f, 13.544f, 7.109f, 11.6403f)
                curveTo(7.0599f, 11.5056f, 7.0069f, 11.3683f, 6.9498f, 11.2287f)
                curveTo(6.8915f, 11.0863f, 6.8288f, 10.9416f, 6.7616f, 10.7947f)
                curveTo(6.6903f, 10.6391f, 6.6138f, 10.4811f, 6.5317f, 10.3211f)
                curveTo(6.4435f, 10.1494f, 6.3489f, 9.9753f, 6.2473f, 9.7994f)
                curveTo(4.965f, 7.5783f, 3.2632f, 6.2316f, 2.6025f, 5.7624f)
                curveTo(3.1459f, 4.589f, 4.0439f, 3.5657f, 5.2489f, 2.87f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.248f, 8.0611f)
                curveTo(18.3157f, 7.9898f, 17.1891f, 7.9644f, 16.0201f, 8.0768f)
                lineTo(21.9232f, 13.9799f)
                curveTo(22.0356f, 12.8109f, 22.0102f, 11.6843f, 21.9389f, 10.752f)
                curveTo(21.8276f, 9.2962f, 20.7038f, 8.1724f, 19.248f, 8.0611f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.752f, 21.9389f)
                curveTo(11.6843f, 22.0102f, 12.8109f, 22.0356f, 13.9799f, 21.9232f)
                lineTo(8.0768f, 16.0201f)
                curveTo(7.9644f, 17.1891f, 7.9898f, 18.3157f, 8.0611f, 19.248f)
                curveTo(8.1724f, 20.7038f, 9.2962f, 21.8276f, 10.752f, 21.9389f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.9597f, 12.312f)
                curveTo(15.1647f, 12.1069f, 15.4972f, 12.1069f, 15.7022f, 12.312f)
                lineTo(16.3238f, 12.9336f)
                lineTo(16.9455f, 12.312f)
                curveTo(17.1505f, 12.1069f, 17.483f, 12.1069f, 17.688f, 12.312f)
                curveTo(17.893f, 12.517f, 17.893f, 12.8494f, 17.688f, 13.0544f)
                lineTo(17.0663f, 13.6761f)
                lineTo(17.688f, 14.2978f)
                curveTo(17.893f, 14.5028f, 17.893f, 14.8352f, 17.688f, 15.0402f)
                curveTo(17.483f, 15.2453f, 17.1505f, 15.2453f, 16.9455f, 15.0402f)
                lineTo(16.3238f, 14.4186f)
                lineTo(15.7424f, 15.0f)
                lineTo(16.3641f, 15.6216f)
                curveTo(16.5691f, 15.8267f, 16.5691f, 16.1591f, 16.3641f, 16.3641f)
                curveTo(16.1591f, 16.5691f, 15.8267f, 16.5691f, 15.6217f, 16.3641f)
                lineTo(15.0f, 15.7424f)
                lineTo(14.4186f, 16.3238f)
                lineTo(15.0402f, 16.9455f)
                curveTo(15.2453f, 17.1505f, 15.2453f, 17.483f, 15.0402f, 17.688f)
                curveTo(14.8352f, 17.893f, 14.5028f, 17.893f, 14.2978f, 17.688f)
                lineTo(13.6761f, 17.0663f)
                lineTo(13.0544f, 17.688f)
                curveTo(12.8494f, 17.893f, 12.517f, 17.893f, 12.312f, 17.688f)
                curveTo(12.1069f, 17.483f, 12.1069f, 17.1505f, 12.312f, 16.9455f)
                lineTo(12.9336f, 16.3238f)
                lineTo(12.312f, 15.7022f)
                curveTo(12.1069f, 15.4972f, 12.1069f, 15.1647f, 12.312f, 14.9597f)
                curveTo(12.517f, 14.7547f, 12.8494f, 14.7547f, 13.0544f, 14.9597f)
                lineTo(13.6761f, 15.5814f)
                lineTo(14.2575f, 15.0f)
                lineTo(13.6358f, 14.3783f)
                curveTo(13.4308f, 14.1733f, 13.4308f, 13.8409f, 13.6358f, 13.6358f)
                curveTo(13.8409f, 13.4308f, 14.1733f, 13.4308f, 14.3783f, 13.6358f)
                lineTo(15.0f, 14.2575f)
                lineTo(15.5814f, 13.6761f)
                lineTo(14.9597f, 13.0544f)
                curveTo(14.7547f, 12.8494f, 14.7547f, 12.517f, 14.9597f, 12.312f)
                close()
            }
        }
            .build()
        return _balls!!
    }

private var _balls: ImageVector? = null
