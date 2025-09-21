package dev.chiksmedina.solar.outline.homefurniture

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
import dev.chiksmedina.solar.outline.HomeFurnitureGroup

val HomeFurnitureGroup.VolumeKnob: ImageVector
    get() {
        if (_volumeKnob != null) {
            return _volumeKnob!!
        }
        _volumeKnob = Builder(
            name = "VolumeKnob", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.25f, 7.816f)
                curveTo(9.2605f, 8.1702f, 7.75f, 9.9087f, 7.75f, 12.0f)
                curveTo(7.75f, 14.3472f, 9.6528f, 16.25f, 12.0f, 16.25f)
                curveTo(14.3472f, 16.25f, 16.25f, 14.3472f, 16.25f, 12.0f)
                curveTo(16.25f, 9.9087f, 14.7395f, 8.1702f, 12.75f, 7.816f)
                verticalLineTo(11.0f)
                curveTo(12.75f, 11.4142f, 12.4142f, 11.75f, 12.0f, 11.75f)
                curveTo(11.5858f, 11.75f, 11.25f, 11.4142f, 11.25f, 11.0f)
                verticalLineTo(7.816f)
                close()
                moveTo(6.25f, 12.0f)
                curveTo(6.25f, 8.8244f, 8.8244f, 6.25f, 12.0f, 6.25f)
                curveTo(15.1756f, 6.25f, 17.75f, 8.8244f, 17.75f, 12.0f)
                curveTo(17.75f, 15.1756f, 15.1756f, 17.75f, 12.0f, 17.75f)
                curveTo(8.8244f, 17.75f, 6.25f, 15.1756f, 6.25f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 3.5f)
                curveTo(13.0f, 4.0523f, 12.5523f, 4.5f, 12.0f, 4.5f)
                curveTo(11.4477f, 4.5f, 11.0f, 4.0523f, 11.0f, 3.5f)
                curveTo(11.0f, 2.9477f, 11.4477f, 2.5f, 12.0f, 2.5f)
                curveTo(12.5523f, 2.5f, 13.0f, 2.9477f, 13.0f, 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.5f, 13.0f)
                curveTo(19.9477f, 13.0f, 19.5f, 12.5523f, 19.5f, 12.0f)
                curveTo(19.5f, 11.4477f, 19.9477f, 11.0f, 20.5f, 11.0f)
                curveTo(21.0523f, 11.0f, 21.5f, 11.4477f, 21.5f, 12.0f)
                curveTo(21.5f, 12.5523f, 21.0523f, 13.0f, 20.5f, 13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.5f, 13.0f)
                curveTo(2.9477f, 13.0f, 2.5f, 12.5523f, 2.5f, 12.0f)
                curveTo(2.5f, 11.4477f, 2.9477f, 11.0f, 3.5f, 11.0f)
                curveTo(4.0523f, 11.0f, 4.5f, 11.4477f, 4.5f, 12.0f)
                curveTo(4.5f, 12.5523f, 4.0523f, 13.0f, 3.5f, 13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.6967f, 5.2825f)
                curveTo(7.0872f, 5.673f, 7.0872f, 6.3062f, 6.6967f, 6.6967f)
                curveTo(6.3062f, 7.0872f, 5.673f, 7.0872f, 5.2825f, 6.6967f)
                curveTo(4.892f, 6.3062f, 4.892f, 5.673f, 5.2825f, 5.2825f)
                curveTo(5.673f, 4.892f, 6.3062f, 4.892f, 6.6967f, 5.2825f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.7175f, 17.3034f)
                curveTo(19.108f, 17.6939f, 19.108f, 18.3271f, 18.7175f, 18.7176f)
                curveTo(18.327f, 19.1081f, 17.6938f, 19.1081f, 17.3033f, 18.7176f)
                curveTo(16.9128f, 18.3271f, 16.9128f, 17.6939f, 17.3033f, 17.3034f)
                curveTo(17.6938f, 16.9129f, 18.327f, 16.9129f, 18.7175f, 17.3034f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.7175f, 6.6967f)
                curveTo(18.327f, 7.0872f, 17.6938f, 7.0872f, 17.3033f, 6.6967f)
                curveTo(16.9128f, 6.3062f, 16.9128f, 5.673f, 17.3033f, 5.2825f)
                curveTo(17.6938f, 4.892f, 18.327f, 4.892f, 18.7175f, 5.2825f)
                curveTo(19.108f, 5.673f, 19.108f, 6.3062f, 18.7175f, 6.6967f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.6967f, 18.7175f)
                curveTo(6.3062f, 19.108f, 5.673f, 19.108f, 5.2825f, 18.7175f)
                curveTo(4.892f, 18.327f, 4.892f, 17.6938f, 5.2825f, 17.3033f)
                curveTo(5.673f, 16.9128f, 6.3062f, 16.9128f, 6.6967f, 17.3033f)
                curveTo(7.0872f, 17.6938f, 7.0872f, 18.327f, 6.6967f, 18.7175f)
                close()
            }
        }
            .build()
        return _volumeKnob!!
    }

private var _volumeKnob: ImageVector? = null
