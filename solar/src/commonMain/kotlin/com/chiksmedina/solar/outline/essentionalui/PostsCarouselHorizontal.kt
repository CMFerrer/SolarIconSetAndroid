package com.chiksmedina.solar.outline.essentionalui

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
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.PostsCarouselHorizontal: ImageVector
    get() {
        if (_postsCarouselHorizontal != null) {
            return _postsCarouselHorizontal!!
        }
        _postsCarouselHorizontal = Builder(
            name = "PostsCarouselHorizontal", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.448f, 4.25f)
                horizontalLineTo(12.552f)
                curveTo(13.4505f, 4.25f, 14.1997f, 4.2499f, 14.7945f, 4.3299f)
                curveTo(15.4223f, 4.4143f, 15.9891f, 4.6f, 16.4445f, 5.0555f)
                curveTo(16.9f, 5.5109f, 17.0857f, 6.0777f, 17.1701f, 6.7055f)
                curveTo(17.2501f, 7.3003f, 17.25f, 8.0495f, 17.25f, 8.948f)
                verticalLineTo(15.052f)
                curveTo(17.25f, 15.9505f, 17.2501f, 16.6997f, 17.1701f, 17.2945f)
                curveTo(17.0857f, 17.9223f, 16.9f, 18.4891f, 16.4445f, 18.9445f)
                curveTo(15.9891f, 19.4f, 15.4223f, 19.5857f, 14.7945f, 19.6701f)
                curveTo(14.1997f, 19.7501f, 13.4505f, 19.75f, 12.552f, 19.75f)
                horizontalLineTo(11.448f)
                curveTo(10.5495f, 19.75f, 9.8003f, 19.7501f, 9.2055f, 19.6701f)
                curveTo(8.5777f, 19.5857f, 8.0109f, 19.4f, 7.5555f, 18.9445f)
                curveTo(7.1f, 18.4891f, 6.9143f, 17.9223f, 6.8299f, 17.2945f)
                curveTo(6.7499f, 16.6997f, 6.75f, 15.9505f, 6.75f, 15.052f)
                lineTo(6.75f, 8.948f)
                curveTo(6.75f, 8.0495f, 6.7499f, 7.3003f, 6.8299f, 6.7055f)
                curveTo(6.9143f, 6.0777f, 7.1f, 5.5109f, 7.5555f, 5.0555f)
                curveTo(8.0109f, 4.6f, 8.5777f, 4.4143f, 9.2055f, 4.3299f)
                curveTo(9.8003f, 4.2499f, 10.5495f, 4.25f, 11.448f, 4.25f)
                close()
                moveTo(9.4054f, 5.8165f)
                curveTo(8.9439f, 5.8786f, 8.7464f, 5.9858f, 8.6161f, 6.1161f)
                curveTo(8.4858f, 6.2464f, 8.3786f, 6.4439f, 8.3165f, 6.9054f)
                curveTo(8.2516f, 7.3884f, 8.25f, 8.036f, 8.25f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(8.25f, 15.964f, 8.2516f, 16.6116f, 8.3165f, 17.0946f)
                curveTo(8.3786f, 17.5561f, 8.4858f, 17.7536f, 8.6161f, 17.8839f)
                curveTo(8.7464f, 18.0142f, 8.9439f, 18.1214f, 9.4054f, 18.1835f)
                curveTo(9.8884f, 18.2484f, 10.536f, 18.25f, 11.5f, 18.25f)
                horizontalLineTo(12.5f)
                curveTo(13.464f, 18.25f, 14.1116f, 18.2484f, 14.5946f, 18.1835f)
                curveTo(15.0561f, 18.1214f, 15.2536f, 18.0142f, 15.3839f, 17.8839f)
                curveTo(15.5142f, 17.7536f, 15.6214f, 17.5561f, 15.6835f, 17.0946f)
                curveTo(15.7484f, 16.6116f, 15.75f, 15.964f, 15.75f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(15.75f, 8.036f, 15.7484f, 7.3884f, 15.6835f, 6.9054f)
                curveTo(15.6214f, 6.4439f, 15.5142f, 6.2464f, 15.3839f, 6.1161f)
                curveTo(15.2536f, 5.9858f, 15.0561f, 5.8786f, 14.5946f, 5.8165f)
                curveTo(14.1116f, 5.7516f, 13.464f, 5.75f, 12.5f, 5.75f)
                horizontalLineTo(11.5f)
                curveTo(10.536f, 5.75f, 9.8884f, 5.7516f, 9.4054f, 5.8165f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.5f, 5.75f)
                curveTo(20.5335f, 5.75f, 19.75f, 6.5335f, 19.75f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(19.75f, 17.4665f, 20.5335f, 18.25f, 21.5f, 18.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 18.25f, 22.75f, 18.5858f, 22.75f, 19.0f)
                curveTo(22.75f, 19.4142f, 22.4142f, 19.75f, 22.0f, 19.75f)
                horizontalLineTo(21.5f)
                curveTo(19.7051f, 19.75f, 18.25f, 18.2949f, 18.25f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(18.25f, 5.7051f, 19.7051f, 4.25f, 21.5f, 4.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 4.25f, 22.75f, 4.5858f, 22.75f, 5.0f)
                curveTo(22.75f, 5.4142f, 22.4142f, 5.75f, 22.0f, 5.75f)
                horizontalLineTo(21.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 4.25f)
                curveTo(1.5858f, 4.25f, 1.25f, 4.5858f, 1.25f, 5.0f)
                curveTo(1.25f, 5.4142f, 1.5858f, 5.75f, 2.0f, 5.75f)
                horizontalLineTo(2.5f)
                curveTo(3.4665f, 5.75f, 4.25f, 6.5335f, 4.25f, 7.5f)
                lineTo(4.25f, 16.5f)
                curveTo(4.25f, 17.4665f, 3.4665f, 18.25f, 2.5f, 18.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 18.25f, 1.25f, 18.5858f, 1.25f, 19.0f)
                curveTo(1.25f, 19.4142f, 1.5858f, 19.75f, 2.0f, 19.75f)
                horizontalLineTo(2.5f)
                curveTo(4.2949f, 19.75f, 5.75f, 18.2949f, 5.75f, 16.5f)
                lineTo(5.75f, 7.5f)
                curveTo(5.75f, 5.7051f, 4.2949f, 4.25f, 2.5f, 4.25f)
                horizontalLineTo(2.0f)
                close()
            }
        }
            .build()
        return _postsCarouselHorizontal!!
    }

private var _postsCarouselHorizontal: ImageVector? = null
