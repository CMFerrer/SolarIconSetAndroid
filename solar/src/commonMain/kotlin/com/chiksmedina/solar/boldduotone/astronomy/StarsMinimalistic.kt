package com.chiksmedina.solar.boldduotone.astronomy

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
import com.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.StarsMinimalistic: ImageVector
    get() {
        if (_starsMinimalistic != null) {
            return _starsMinimalistic!!
        }
        _starsMinimalistic = Builder(
            name = "StarsMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0802f, 7.8971f)
                curveTo(11.1568f, 5.9657f, 11.6952f, 5.0f, 12.5f, 5.0f)
                curveTo(13.3048f, 5.0f, 13.8432f, 5.9657f, 14.9198f, 7.8971f)
                lineTo(15.1984f, 8.3968f)
                curveTo(15.5043f, 8.9456f, 15.6573f, 9.2201f, 15.8958f, 9.4011f)
                curveTo(16.1343f, 9.5822f, 16.4314f, 9.6494f, 17.0255f, 9.7838f)
                lineTo(17.5664f, 9.9062f)
                curveTo(19.6571f, 10.3793f, 20.7025f, 10.6158f, 20.9512f, 11.4156f)
                curveTo(21.1999f, 12.2153f, 20.4872f, 13.0487f, 19.0619f, 14.7154f)
                lineTo(18.6932f, 15.1466f)
                curveTo(18.2881f, 15.6203f, 18.0856f, 15.8571f, 17.9945f, 16.1501f)
                curveTo(17.9034f, 16.443f, 17.934f, 16.759f, 17.9953f, 17.3909f)
                lineTo(18.051f, 17.9662f)
                curveTo(18.2665f, 20.19f, 18.3742f, 21.3019f, 17.7231f, 21.7962f)
                curveTo(17.072f, 22.2905f, 16.0932f, 21.8398f, 14.1357f, 20.9385f)
                lineTo(13.6292f, 20.7053f)
                curveTo(13.073f, 20.4492f, 12.7948f, 20.3211f, 12.5f, 20.3211f)
                curveTo(12.2052f, 20.3211f, 11.927f, 20.4492f, 11.3708f, 20.7053f)
                lineTo(10.8643f, 20.9385f)
                curveTo(8.9068f, 21.8398f, 7.928f, 22.2905f, 7.2769f, 21.7962f)
                curveTo(6.6258f, 21.3019f, 6.7335f, 20.19f, 6.949f, 17.9662f)
                lineTo(7.0047f, 17.3909f)
                curveTo(7.066f, 16.759f, 7.0966f, 16.443f, 7.0055f, 16.1501f)
                curveTo(6.9144f, 15.8571f, 6.7119f, 15.6203f, 6.3068f, 15.1466f)
                lineTo(5.9381f, 14.7154f)
                curveTo(4.5128f, 13.0487f, 3.8001f, 12.2153f, 4.0488f, 11.4156f)
                curveTo(4.2975f, 10.6158f, 5.3429f, 10.3793f, 7.4336f, 9.9062f)
                lineTo(7.9745f, 9.7838f)
                curveTo(8.5686f, 9.6494f, 8.8657f, 9.5822f, 9.1042f, 9.4011f)
                curveTo(9.3427f, 9.2201f, 9.4957f, 8.9457f, 9.8017f, 8.3968f)
                lineTo(10.0802f, 7.8971f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.8673f, 2.5006f)
                curveTo(4.8973f, 2.3948f, 5.085f, 2.3942f, 5.1157f, 2.4997f)
                curveTo(5.2559f, 2.9818f, 5.5159f, 3.6945f, 5.909f, 4.0849f)
                curveTo(6.3022f, 4.4754f, 7.0165f, 4.7306f, 7.4996f, 4.8675f)
                curveTo(7.6054f, 4.8975f, 7.606f, 5.0853f, 7.5004f, 5.116f)
                curveTo(7.0183f, 5.2562f, 6.3057f, 5.5162f, 5.9152f, 5.9093f)
                curveTo(5.5247f, 6.3024f, 5.2696f, 7.0168f, 5.1326f, 7.4998f)
                curveTo(5.1026f, 7.6056f, 4.9149f, 7.6062f, 4.8842f, 7.5006f)
                curveTo(4.744f, 7.0185f, 4.484f, 6.3059f, 4.0909f, 5.9155f)
                curveTo(3.6977f, 5.525f, 2.9834f, 5.2698f, 2.5003f, 5.1329f)
                curveTo(2.3946f, 5.1029f, 2.3939f, 4.9151f, 2.4995f, 4.8844f)
                curveTo(2.9816f, 4.7442f, 3.6942f, 4.4842f, 4.0847f, 4.0911f)
                curveTo(4.4752f, 3.698f, 4.7303f, 2.9836f, 4.8673f, 2.5006f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(19.0f, 3.25f)
                curveTo(19.4142f, 3.25f, 19.75f, 3.5858f, 19.75f, 4.0f)
                verticalLineTo(4.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 4.25f, 20.75f, 4.5858f, 20.75f, 5.0f)
                curveTo(20.75f, 5.4142f, 20.4142f, 5.75f, 20.0f, 5.75f)
                horizontalLineTo(19.75f)
                verticalLineTo(6.0f)
                curveTo(19.75f, 6.4142f, 19.4142f, 6.75f, 19.0f, 6.75f)
                curveTo(18.5858f, 6.75f, 18.25f, 6.4142f, 18.25f, 6.0f)
                verticalLineTo(5.75f)
                horizontalLineTo(18.0f)
                curveTo(17.5858f, 5.75f, 17.25f, 5.4142f, 17.25f, 5.0f)
                curveTo(17.25f, 4.5858f, 17.5858f, 4.25f, 18.0f, 4.25f)
                horizontalLineTo(18.25f)
                verticalLineTo(4.0f)
                curveTo(18.25f, 3.5858f, 18.5858f, 3.25f, 19.0f, 3.25f)
                close()
            }
        }
            .build()
        return _starsMinimalistic!!
    }

private var _starsMinimalistic: ImageVector? = null
