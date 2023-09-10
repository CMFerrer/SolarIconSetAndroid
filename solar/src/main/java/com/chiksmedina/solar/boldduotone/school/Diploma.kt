package com.chiksmedina.solar.boldduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.SchoolGroup

val SchoolGroup.Diploma: ImageVector
    get() {
        if (_diploma != null) {
            return _diploma!!
        }
        _diploma = Builder(
            name = "Diploma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 14.8284f, 2.0f, 16.2426f, 2.8787f, 17.1213f)
                curveTo(3.355f, 17.5977f, 3.9888f, 17.8158f, 4.9199f, 17.9156f)
                curveTo(4.9939f, 17.8157f, 5.064f, 17.737f, 5.1139f, 17.6821f)
                curveTo(5.2301f, 17.5543f, 5.3774f, 17.4091f, 5.5202f, 17.2683f)
                lineTo(7.0131f, 15.7962f)
                lineTo(7.5645f, 15.2377f)
                curveTo(7.9268f, 13.1151f, 9.7746f, 11.5f, 12.0001f, 11.5f)
                curveTo(14.2255f, 11.5f, 16.0733f, 13.1151f, 16.4357f, 15.2377f)
                lineTo(16.987f, 15.7962f)
                lineTo(18.48f, 17.2684f)
                curveTo(18.6228f, 17.4092f, 18.7701f, 17.5544f, 18.8862f, 17.6821f)
                curveTo(18.9362f, 17.737f, 19.0062f, 17.8157f, 19.0802f, 17.9156f)
                curveTo(20.0113f, 17.8158f, 20.645f, 17.5977f, 21.1213f, 17.1213f)
                curveTo(22.0f, 16.2426f, 22.0f, 14.8284f, 22.0f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 5.1716f, 22.0f, 3.7574f, 21.1213f, 2.8787f)
                curveTo(20.2426f, 2.0f, 18.8284f, 2.0f, 16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 2.0f, 3.7574f, 2.0f, 2.8787f, 2.8787f)
                curveTo(2.0f, 3.7574f, 2.0f, 5.1716f, 2.0f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 8.75f)
                curveTo(6.5858f, 8.75f, 6.25f, 9.0858f, 6.25f, 9.5f)
                curveTo(6.25f, 9.9142f, 6.5858f, 10.25f, 7.0f, 10.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 10.25f, 17.75f, 9.9142f, 17.75f, 9.5f)
                curveTo(17.75f, 9.0858f, 17.4142f, 8.75f, 17.0f, 8.75f)
                horizontalLineTo(7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.25f, 6.0f)
                curveTo(8.25f, 5.5858f, 8.5858f, 5.25f, 9.0f, 5.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 5.25f, 15.75f, 5.5858f, 15.75f, 6.0f)
                curveTo(15.75f, 6.4142f, 15.4142f, 6.75f, 15.0f, 6.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 6.75f, 8.25f, 6.4142f, 8.25f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0011f, 15.9174f)
                curveTo(9.0004f, 15.9449f, 9.0f, 15.9724f, 9.0f, 16.0f)
                curveTo(9.0f, 17.6569f, 10.3431f, 19.0f, 12.0f, 19.0f)
                curveTo(13.6569f, 19.0f, 15.0f, 17.6569f, 15.0f, 16.0f)
                curveTo(15.0f, 15.9724f, 14.9996f, 15.9449f, 14.9989f, 15.9174f)
                curveTo(14.9551f, 14.2987f, 13.6292f, 13.0f, 12.0f, 13.0f)
                curveTo(10.4467f, 13.0f, 9.1691f, 14.1805f, 9.0155f, 15.6933f)
                curveTo(9.008f, 15.7672f, 9.0031f, 15.842f, 9.0011f, 15.9174f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.6757f, 17.2494f)
                lineTo(6.5952f, 18.3148f)
                curveTo(6.2712f, 18.6344f, 6.1091f, 18.7942f, 6.0531f, 18.9295f)
                curveTo(5.9253f, 19.2378f, 6.0346f, 19.5799f, 6.3128f, 19.7421f)
                curveTo(6.4349f, 19.8132f, 6.6551f, 19.8354f, 7.0955f, 19.8798f)
                curveTo(7.3442f, 19.9048f, 7.4685f, 19.9173f, 7.5727f, 19.9554f)
                curveTo(7.8058f, 20.0405f, 7.9872f, 20.2193f, 8.0735f, 20.4492f)
                curveTo(8.112f, 20.5519f, 8.1247f, 20.6745f, 8.1501f, 20.9197f)
                curveTo(8.1951f, 21.354f, 8.2176f, 21.5711f, 8.2898f, 21.6915f)
                curveTo(8.4543f, 21.9659f, 8.8011f, 22.0737f, 9.1138f, 21.9477f)
                curveTo(9.251f, 21.8924f, 9.4131f, 21.7326f, 9.7371f, 21.413f)
                lineTo(10.8175f, 20.343f)
                curveTo(9.305f, 19.9322f, 8.1092f, 18.7524f, 7.6757f, 17.2494f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.1825f, 20.343f)
                lineTo(14.2629f, 21.413f)
                curveTo(14.5869f, 21.7326f, 14.749f, 21.8924f, 14.8862f, 21.9477f)
                curveTo(15.1989f, 22.0737f, 15.5457f, 21.9659f, 15.7102f, 21.6915f)
                curveTo(15.7824f, 21.5711f, 15.8049f, 21.354f, 15.8499f, 20.9197f)
                curveTo(15.8753f, 20.6745f, 15.888f, 20.5519f, 15.9265f, 20.4492f)
                curveTo(16.0129f, 20.2193f, 16.1942f, 20.0405f, 16.4273f, 19.9554f)
                curveTo(16.5315f, 19.9173f, 16.6558f, 19.9048f, 16.9045f, 19.8798f)
                curveTo(17.3449f, 19.8354f, 17.5651f, 19.8132f, 17.6872f, 19.7421f)
                curveTo(17.9654f, 19.5799f, 18.0747f, 19.2378f, 17.9469f, 18.9295f)
                curveTo(17.8909f, 18.7942f, 17.7288f, 18.6344f, 17.4048f, 18.3148f)
                lineTo(16.3243f, 17.2494f)
                curveTo(15.8908f, 18.7524f, 14.6949f, 19.9322f, 13.1825f, 20.343f)
                close()
            }
        }
            .build()
        return _diploma!!
    }

private var _diploma: ImageVector? = null
