package com.chiksmedina.solar.boldduotone.like

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
import com.chiksmedina.solar.boldduotone.LikeGroup

val LikeGroup.Like: ImageVector
    get() {
        if (_like != null) {
            return _like!!
        }
        _like = Builder(
            name = "Like", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.2696f, 16.265f)
                lineTo(20.9751f, 12.1852f)
                curveTo(21.1514f, 11.1662f, 20.3677f, 10.2342f, 19.3348f, 10.2342f)
                horizontalLineTo(14.1537f)
                curveTo(13.6402f, 10.2342f, 13.2491f, 9.7733f, 13.3323f, 9.266f)
                lineTo(13.9949f, 5.2214f)
                curveTo(14.1026f, 4.5644f, 14.0719f, 3.892f, 13.9047f, 3.2475f)
                curveTo(13.7662f, 2.7136f, 13.3543f, 2.285f, 12.8126f, 2.1109f)
                lineTo(12.6676f, 2.0643f)
                curveTo(12.3402f, 1.9592f, 11.9829f, 1.9836f, 11.6742f, 2.1324f)
                curveTo(11.3344f, 2.2961f, 11.0859f, 2.5947f, 10.9938f, 2.9499f)
                lineTo(10.518f, 4.7837f)
                curveTo(10.3667f, 5.3672f, 10.1462f, 5.9304f, 9.8619f, 6.4626f)
                curveTo(9.4466f, 7.2402f, 8.8044f, 7.8625f, 8.1369f, 8.4377f)
                lineTo(6.6981f, 9.6775f)
                curveTo(6.2925f, 10.0271f, 6.0794f, 10.5506f, 6.1256f, 11.0844f)
                lineTo(6.9378f, 20.4771f)
                curveTo(7.0123f, 21.3386f, 7.7326f, 22.0f, 8.5963f, 22.0f)
                horizontalLineTo(13.245f)
                curveTo(16.7263f, 22.0f, 19.6973f, 19.5744f, 20.2696f, 16.265f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(2.9677f, 9.4851f)
                curveTo(3.3689f, 9.4678f, 3.7126f, 9.7696f, 3.7472f, 10.1698f)
                lineTo(4.7188f, 21.4063f)
                curveTo(4.7812f, 22.1281f, 4.2127f, 22.7502f, 3.4867f, 22.7502f)
                curveTo(2.8029f, 22.7502f, 2.25f, 22.1954f, 2.25f, 21.5129f)
                verticalLineTo(10.2344f)
                curveTo(2.25f, 9.8328f, 2.5664f, 9.5024f, 2.9677f, 9.4851f)
                close()
            }
        }
            .build()
        return _like!!
    }

private var _like: ImageVector? = null
