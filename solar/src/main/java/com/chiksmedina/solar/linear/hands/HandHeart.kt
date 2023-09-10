package com.chiksmedina.solar.linear.hands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.HandsGroup

val HandsGroup.HandHeart: ImageVector
    get() {
        if (_handHeart != null) {
            return _handHeart!!
        }
        _handHeart = Builder(
            name = "HandHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.1497f, 8.8022f)
                lineTo(9.7079f, 9.4082f)
                lineTo(10.1497f, 8.8022f)
                close()
                moveTo(12.0f, 3.1061f)
                lineTo(11.4925f, 3.6583f)
                curveTo(11.7794f, 3.9221f, 12.2206f, 3.9221f, 12.5075f, 3.6583f)
                lineTo(12.0f, 3.1061f)
                close()
                moveTo(13.8503f, 8.8022f)
                lineTo(14.2921f, 9.4083f)
                lineTo(13.8503f, 8.8022f)
                close()
                moveTo(12.0f, 9.676f)
                lineTo(12.0f, 10.426f)
                horizontalLineTo(12.0f)
                lineTo(12.0f, 9.676f)
                close()
                moveTo(10.5915f, 8.1961f)
                curveTo(9.9013f, 7.693f, 9.1651f, 7.0811f, 8.6088f, 6.4363f)
                curveTo(8.0345f, 5.7705f, 7.75f, 5.1823f, 7.75f, 4.7148f)
                horizontalLineTo(6.25f)
                curveTo(6.25f, 5.7323f, 6.8285f, 6.6688f, 7.4731f, 7.4161f)
                curveTo(8.1357f, 8.1842f, 8.9743f, 8.8735f, 9.7079f, 9.4082f)
                lineTo(10.5915f, 8.1961f)
                close()
                moveTo(7.75f, 4.7148f)
                curveTo(7.75f, 3.6561f, 8.27f, 3.0523f, 8.8955f, 2.8418f)
                curveTo(9.5475f, 2.6224f, 10.5199f, 2.7643f, 11.4925f, 3.6583f)
                lineTo(12.5075f, 2.554f)
                curveTo(11.2302f, 1.3799f, 9.7025f, 0.9876f, 8.4171f, 1.4202f)
                curveTo(7.105f, 1.8617f, 6.25f, 3.0962f, 6.25f, 4.7148f)
                horizontalLineTo(7.75f)
                close()
                moveTo(14.2921f, 9.4083f)
                curveTo(15.0257f, 8.8735f, 15.8643f, 8.1842f, 16.527f, 7.4161f)
                curveTo(17.1716f, 6.6689f, 17.75f, 5.7323f, 17.75f, 4.7147f)
                horizontalLineTo(16.25f)
                curveTo(16.25f, 5.1823f, 15.9655f, 5.7705f, 15.3912f, 6.4363f)
                curveTo(14.8349f, 7.0811f, 14.0987f, 7.693f, 13.4085f, 8.1961f)
                lineTo(14.2921f, 9.4083f)
                close()
                moveTo(17.75f, 4.7147f)
                curveTo(17.75f, 3.0962f, 16.895f, 1.8617f, 15.5829f, 1.4202f)
                curveTo(14.2975f, 0.9876f, 12.7698f, 1.3799f, 11.4925f, 2.554f)
                lineTo(12.5075f, 3.6583f)
                curveTo(13.4801f, 2.7643f, 14.4525f, 2.6224f, 15.1045f, 2.8418f)
                curveTo(15.73f, 3.0523f, 16.25f, 3.6561f, 16.25f, 4.7147f)
                horizontalLineTo(17.75f)
                close()
                moveTo(9.7079f, 9.4082f)
                curveTo(10.463f, 9.9587f, 11.0618f, 10.426f, 12.0f, 10.426f)
                lineTo(12.0f, 8.926f)
                curveTo(11.635f, 8.926f, 11.4347f, 8.8107f, 10.5915f, 8.1961f)
                lineTo(9.7079f, 9.4082f)
                close()
                moveTo(13.4085f, 8.1961f)
                curveTo(12.5653f, 8.8107f, 12.365f, 8.926f, 12.0f, 8.926f)
                lineTo(12.0f, 10.426f)
                curveTo(12.9382f, 10.426f, 13.537f, 9.9587f, 14.2921f, 9.4083f)
                lineTo(13.4085f, 8.1961f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 20.3884f)
                horizontalLineTo(7.2599f)
                curveTo(8.2708f, 20.3884f, 9.2925f, 20.4937f, 10.2763f, 20.6964f)
                curveTo(12.0166f, 21.0549f, 13.8488f, 21.0983f, 15.6069f, 20.8138f)
                curveTo(16.4738f, 20.6734f, 17.326f, 20.4589f, 18.0975f, 20.0865f)
                curveTo(18.7939f, 19.7504f, 19.6469f, 19.2766f, 20.2199f, 18.7459f)
                curveTo(20.7921f, 18.216f, 21.388f, 17.3487f, 21.8109f, 16.6707f)
                curveTo(22.1736f, 16.0894f, 21.9982f, 15.3762f, 21.4245f, 14.943f)
                curveTo(20.7873f, 14.4619f, 19.8417f, 14.462f, 19.2046f, 14.9433f)
                lineTo(17.3974f, 16.3084f)
                curveTo(16.697f, 16.8375f, 15.932f, 17.3245f, 15.0206f, 17.4699f)
                curveTo(14.911f, 17.4874f, 14.7962f, 17.5033f, 14.6764f, 17.5172f)
                moveTo(14.6764f, 17.5172f)
                curveTo(14.6403f, 17.5214f, 14.6038f, 17.5254f, 14.5668f, 17.5292f)
                moveTo(14.6764f, 17.5172f)
                curveTo(14.8222f, 17.486f, 14.9669f, 17.396f, 15.1028f, 17.2775f)
                curveTo(15.746f, 16.7161f, 15.7866f, 15.77f, 15.2285f, 15.1431f)
                curveTo(15.0991f, 14.9977f, 14.9475f, 14.8764f, 14.7791f, 14.7759f)
                curveTo(11.9817f, 13.1074f, 7.6294f, 14.3782f, 5.0f, 16.2429f)
                moveTo(14.6764f, 17.5172f)
                curveTo(14.6399f, 17.525f, 14.6033f, 17.5292f, 14.5668f, 17.5292f)
                moveTo(14.5668f, 17.5292f)
                curveTo(14.0434f, 17.5829f, 13.4312f, 17.5968f, 12.7518f, 17.5326f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.5f, 14.0f)
                lineTo(3.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 15.5f)
                lineTo(5.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 22.0f)
                lineTo(3.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 20.5f)
                lineTo(2.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 14.0f)
                close()
            }
        }
            .build()
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
