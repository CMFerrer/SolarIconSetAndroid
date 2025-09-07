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

val HandsGroup.HandMoney: ImageVector
    get() {
        if (_handMoney != null) {
            return _handMoney!!
        }
        _handMoney = Builder(
            name = "HandMoney", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.4142f, 10.4142f)
                curveTo(18.0f, 9.8284f, 18.0f, 8.8856f, 18.0f, 7.0f)
                curveTo(18.0f, 5.1144f, 18.0f, 4.1716f, 17.4142f, 3.5858f)
                moveTo(17.4142f, 10.4142f)
                curveTo(16.8284f, 11.0f, 15.8856f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(10.0f)
                curveTo(8.1144f, 11.0f, 7.1716f, 11.0f, 6.5858f, 10.4142f)
                moveTo(17.4142f, 10.4142f)
                curveTo(17.4142f, 10.4142f, 17.4142f, 10.4142f, 17.4142f, 10.4142f)
                close()
                moveTo(17.4142f, 3.5858f)
                curveTo(16.8284f, 3.0f, 15.8856f, 3.0f, 14.0f, 3.0f)
                lineTo(10.0f, 3.0f)
                curveTo(8.1144f, 3.0f, 7.1716f, 3.0f, 6.5858f, 3.5858f)
                moveTo(17.4142f, 3.5858f)
                curveTo(17.4142f, 3.5858f, 17.4142f, 3.5858f, 17.4142f, 3.5858f)
                close()
                moveTo(6.5858f, 3.5858f)
                curveTo(6.0f, 4.1716f, 6.0f, 5.1144f, 6.0f, 7.0f)
                curveTo(6.0f, 8.8856f, 6.0f, 9.8284f, 6.5858f, 10.4142f)
                moveTo(6.5858f, 3.5858f)
                curveTo(6.5858f, 3.5858f, 6.5858f, 3.5858f, 6.5858f, 3.5858f)
                close()
                moveTo(6.5858f, 10.4142f)
                curveTo(6.5858f, 10.4142f, 6.5858f, 10.4142f, 6.5858f, 10.4142f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 7.0f)
                curveTo(13.0f, 7.5523f, 12.5523f, 8.0f, 12.0f, 8.0f)
                curveTo(11.4477f, 8.0f, 11.0f, 7.5523f, 11.0f, 7.0f)
                curveTo(11.0f, 6.4477f, 11.4477f, 6.0f, 12.0f, 6.0f)
                curveTo(12.5523f, 6.0f, 13.0f, 6.4477f, 13.0f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 6.0f)
                curveTo(16.3431f, 6.0f, 15.0f, 4.6568f, 15.0f, 3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 8.0f)
                curveTo(16.3431f, 8.0f, 15.0f, 9.3432f, 15.0f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 6.0f)
                curveTo(7.6568f, 6.0f, 9.0f, 4.6568f, 9.0f, 3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 8.0f)
                curveTo(7.6568f, 8.0f, 9.0f, 9.3432f, 9.0f, 11.0f)
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
        return _handMoney!!
    }

private var _handMoney: ImageVector? = null
