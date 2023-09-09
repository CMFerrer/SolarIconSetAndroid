package com.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SchoolGroup

public val SchoolGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.25f)
                curveTo(8.5858f, 5.25f, 8.25f, 5.5858f, 8.25f, 6.0f)
                curveTo(8.25f, 6.4142f, 8.5858f, 6.75f, 9.0f, 6.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 6.75f, 15.75f, 6.4142f, 15.75f, 6.0f)
                curveTo(15.75f, 5.5858f, 15.4142f, 5.25f, 15.0f, 5.25f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9425f, 1.25f)
                curveTo(9.8699f, 1.25f, 8.2372f, 1.25f, 6.9613f, 1.4234f)
                curveTo(5.6512f, 1.6014f, 4.6061f, 1.9747f, 3.7848f, 2.8048f)
                curveTo(2.9647f, 3.6339f, 2.5969f, 4.687f, 2.4213f, 6.0074f)
                curveTo(2.25f, 7.2955f, 2.25f, 8.9446f, 2.25f, 11.0411f)
                verticalLineTo(16.139f)
                curveTo(2.25f, 17.6466f, 2.25f, 18.8402f, 2.346f, 19.7388f)
                curveTo(2.4409f, 20.6269f, 2.6445f, 21.428f, 3.2258f, 21.9638f)
                curveTo(3.6923f, 22.3937f, 4.2821f, 22.6646f, 4.9117f, 22.7367f)
                curveTo(5.6991f, 22.8268f, 6.4344f, 22.4508f, 7.1587f, 21.9377f)
                curveTo(7.8916f, 21.4185f, 8.7808f, 20.6321f, 9.9025f, 19.6399f)
                lineTo(9.939f, 19.6076f)
                curveTo(10.4591f, 19.1476f, 10.8112f, 18.8372f, 11.105f, 18.6224f)
                curveTo(11.3889f, 18.4148f, 11.5623f, 18.3397f, 11.7084f, 18.3103f)
                curveTo(11.9009f, 18.2715f, 12.0991f, 18.2715f, 12.2916f, 18.3103f)
                curveTo(12.4377f, 18.3397f, 12.6111f, 18.4148f, 12.895f, 18.6224f)
                curveTo(13.1888f, 18.8372f, 13.5409f, 19.1476f, 14.061f, 19.6076f)
                lineTo(14.0975f, 19.64f)
                curveTo(15.2193f, 20.6321f, 16.1084f, 21.4186f, 16.8413f, 21.9377f)
                curveTo(17.5656f, 22.4508f, 18.3009f, 22.8268f, 19.0883f, 22.7367f)
                curveTo(19.7179f, 22.6646f, 20.3077f, 22.3937f, 20.7742f, 21.9638f)
                curveTo(21.3555f, 21.428f, 21.5591f, 20.6269f, 21.654f, 19.7388f)
                curveTo(21.75f, 18.8402f, 21.75f, 17.6466f, 21.75f, 16.139f)
                verticalLineTo(11.041f)
                curveTo(21.75f, 8.9446f, 21.75f, 7.2955f, 21.5787f, 6.0074f)
                curveTo(21.4031f, 4.687f, 21.0353f, 3.6339f, 20.2152f, 2.8048f)
                curveTo(19.3939f, 1.9747f, 18.3488f, 1.6014f, 17.0387f, 1.4234f)
                curveTo(15.7628f, 1.25f, 14.1301f, 1.25f, 12.0575f, 1.25f)
                horizontalLineTo(11.9425f)
                close()
                moveTo(4.8512f, 3.8598f)
                curveTo(5.348f, 3.3576f, 6.0225f, 3.0647f, 7.1633f, 2.9097f)
                curveTo(8.3265f, 2.7516f, 9.8573f, 2.75f, 12.0f, 2.75f)
                curveTo(14.1427f, 2.75f, 15.6736f, 2.7516f, 16.8367f, 2.9097f)
                curveTo(17.9775f, 3.0647f, 18.652f, 3.3576f, 19.1488f, 3.8598f)
                curveTo(19.6467f, 4.363f, 19.9379f, 5.0482f, 20.0918f, 6.2052f)
                curveTo(20.2484f, 7.3829f, 20.25f, 8.9322f, 20.25f, 11.0975f)
                verticalLineTo(16.0909f)
                curveTo(20.25f, 17.6572f, 20.249f, 18.7702f, 20.1625f, 19.5794f)
                curveTo(20.0739f, 20.4088f, 19.9104f, 20.72f, 19.7576f, 20.8608f)
                curveTo(19.5238f, 21.0763f, 19.2298f, 21.2107f, 18.9178f, 21.2464f)
                curveTo(18.7182f, 21.2692f, 18.3835f, 21.192f, 17.7083f, 20.7137f)
                curveTo(17.0497f, 20.2472f, 16.2211f, 19.5157f, 15.0547f, 18.484f)
                lineTo(15.0286f, 18.4609f)
                curveTo(14.5413f, 18.0299f, 14.1372f, 17.6725f, 13.7804f, 17.4116f)
                curveTo(13.4074f, 17.1388f, 13.0312f, 16.9292f, 12.5878f, 16.8398f)
                curveTo(12.1998f, 16.7617f, 11.8002f, 16.7617f, 11.4122f, 16.8398f)
                curveTo(10.9688f, 16.9292f, 10.5926f, 17.1388f, 10.2196f, 17.4116f)
                curveTo(9.8628f, 17.6725f, 9.4587f, 18.0299f, 8.9715f, 18.4609f)
                lineTo(8.9453f, 18.484f)
                curveTo(7.7789f, 19.5157f, 6.9503f, 20.2472f, 6.2916f, 20.7137f)
                curveTo(5.6165f, 21.192f, 5.2818f, 21.2692f, 5.0822f, 21.2464f)
                curveTo(4.7702f, 21.2107f, 4.4762f, 21.0763f, 4.2424f, 20.8608f)
                curveTo(4.0896f, 20.72f, 3.9261f, 20.4088f, 3.8375f, 19.5794f)
                curveTo(3.751f, 18.7702f, 3.75f, 17.6572f, 3.75f, 16.0909f)
                verticalLineTo(11.0975f)
                curveTo(3.75f, 8.9322f, 3.7516f, 7.3829f, 3.9082f, 6.2052f)
                curveTo(4.0621f, 5.0482f, 4.3533f, 4.363f, 4.8512f, 3.8598f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
