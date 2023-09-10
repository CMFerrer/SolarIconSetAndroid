package com.chiksmedina.solar.bold.sports

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
import com.chiksmedina.solar.bold.SportsGroup

val SportsGroup.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(
            name = "Basketball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.8648f, 20.5828f)
                curveTo(5.4488f, 19.7374f, 4.2226f, 18.5294f, 3.3394f, 16.9997f)
                curveTo(2.457f, 15.4713f, 2.0239f, 13.8067f, 1.9992f, 12.159f)
                lineTo(2.1437f, 12.1875f)
                curveTo(5.0927f, 12.7683f, 8.4477f, 11.7182f, 11.2054f, 10.0251f)
                curveTo(11.5681f, 9.8024f, 11.9236f, 9.5666f, 12.2696f, 9.3194f)
                curveTo(12.6828f, 9.8354f, 13.0528f, 10.3587f, 13.3509f, 10.875f)
                curveTo(13.7246f, 11.5223f, 14.0627f, 12.2923f, 14.3648f, 13.1149f)
                curveTo(13.8475f, 13.3653f, 13.3431f, 13.641f, 12.857f, 13.9368f)
                curveTo(10.0652f, 15.6356f, 7.6833f, 18.1135f, 6.8653f, 20.5815f)
                lineTo(6.8648f, 20.5828f)
                close()
                moveTo(16.2597f, 21.0475f)
                curveTo(13.6548f, 22.2776f, 10.7414f, 22.2853f, 8.221f, 21.2588f)
                lineTo(8.2891f, 21.0535f)
                curveTo(8.9526f, 19.0517f, 11.0085f, 16.8174f, 13.6367f, 15.2182f)
                curveTo(14.0315f, 14.9779f, 14.4348f, 14.7547f, 14.8435f, 14.5507f)
                curveTo(15.0956f, 15.3805f, 15.3141f, 16.2223f, 15.4986f, 17.0128f)
                curveTo(15.7379f, 18.0383f, 15.9155f, 18.9575f, 16.0332f, 19.6201f)
                curveTo(16.092f, 19.9512f, 16.1357f, 20.2176f, 16.1647f, 20.4004f)
                curveTo(16.1791f, 20.4919f, 16.1899f, 20.5624f, 16.197f, 20.6096f)
                lineTo(16.2048f, 20.6626f)
                lineTo(16.2067f, 20.6755f)
                lineTo(16.2072f, 20.6791f)
                lineTo(16.2597f, 21.0475f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.226f, 13.9425f)
                curveTo(18.1135f, 13.2236f, 20.0375f, 12.9473f, 21.7028f, 13.3127f)
                lineTo(21.9075f, 13.3576f)
                curveTo(21.7857f, 14.2418f, 21.5464f, 15.1071f, 21.1962f, 15.9286f)
                curveTo(20.4718f, 17.6278f, 19.2731f, 19.1396f, 17.6587f, 20.2451f)
                lineTo(17.6462f, 20.166f)
                curveTo(17.616f, 19.9748f, 17.5707f, 19.699f, 17.51f, 19.3578f)
                curveTo(17.3889f, 18.6757f, 17.2061f, 17.7295f, 16.9593f, 16.672f)
                curveTo(16.7604f, 15.8192f, 16.5168f, 14.8803f, 16.226f, 13.9425f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.4527f, 8.3974f)
                curveTo(15.1813f, 6.9282f, 16.5398f, 5.1865f, 17.1248f, 3.4482f)
                lineTo(17.1353f, 3.417f)
                curveTo(18.551f, 4.2624f, 19.777f, 5.4703f, 20.6599f, 6.9997f)
                curveTo(21.5427f, 8.5287f, 21.9758f, 10.194f, 22.0003f, 11.8423f)
                curveTo(20.0046f, 11.4109f, 17.814f, 11.7412f, 15.7444f, 12.5213f)
                curveTo(15.4236f, 11.6577f, 15.0595f, 10.8345f, 14.6499f, 10.125f)
                curveTo(14.3138f, 9.5427f, 13.9036f, 8.9619f, 13.4527f, 8.3974f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.3187f, 3.4541f)
                curveTo(8.0667f, 3.2547f, 7.8614f, 3.0975f, 7.7185f, 2.9894f)
                lineTo(7.6961f, 2.9726f)
                curveTo(9.4586f, 2.13f, 11.3644f, 1.8489f, 13.1955f, 2.0709f)
                curveTo(14.0828f, 2.1784f, 14.9526f, 2.4041f, 15.78f, 2.7413f)
                lineTo(15.7031f, 2.9697f)
                curveTo(15.2259f, 4.3877f, 14.053f, 5.9204f, 12.4748f, 7.2604f)
                curveTo(11.7444f, 6.4654f, 10.974f, 5.7288f, 10.2722f, 5.0993f)
                curveTo(9.515f, 4.4202f, 8.8224f, 3.8524f, 8.3187f, 3.4541f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.4205f, 8.7468f)
                curveTo(7.8339f, 10.3349f, 4.8702f, 11.1956f, 2.4335f, 10.7157f)
                lineTo(2.091f, 10.6483f)
                curveTo(2.4602f, 7.9549f, 3.9195f, 5.4374f, 6.2815f, 3.7952f)
                lineTo(6.6095f, 4.0336f)
                lineTo(6.6115f, 4.0351f)
                lineTo(6.6209f, 4.0419f)
                lineTo(6.6599f, 4.0707f)
                curveTo(6.6947f, 4.0965f, 6.7469f, 4.1354f, 6.8144f, 4.1863f)
                curveTo(6.9494f, 4.2883f, 7.1458f, 4.4388f, 7.3883f, 4.6306f)
                curveTo(7.8736f, 5.0144f, 8.5416f, 5.5621f, 9.2707f, 6.216f)
                curveTo(9.9305f, 6.8078f, 10.6284f, 7.4762f, 11.2826f, 8.1806f)
                curveTo(11.0034f, 8.3764f, 10.7156f, 8.5656f, 10.4205f, 8.7468f)
                close()
            }
        }
            .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
