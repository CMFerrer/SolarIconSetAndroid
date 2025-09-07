package com.chiksmedina.solar.bold.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.HomeFurnitureGroup

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
                pathFillType = NonZero
            ) {
                moveTo(11.25f, 7.0559f)
                curveTo(8.8444f, 7.4178f, 7.0f, 9.4935f, 7.0f, 12.0f)
                curveTo(7.0f, 14.7615f, 9.2386f, 17.0f, 12.0f, 17.0f)
                curveTo(14.7614f, 17.0f, 17.0f, 14.7615f, 17.0f, 12.0f)
                curveTo(17.0f, 9.4935f, 15.1556f, 7.4178f, 12.75f, 7.0559f)
                verticalLineTo(11.0f)
                curveTo(12.75f, 11.4142f, 12.4142f, 11.75f, 12.0f, 11.75f)
                curveTo(11.5858f, 11.75f, 11.25f, 11.4142f, 11.25f, 11.0f)
                verticalLineTo(7.0559f)
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
                curveTo(7.0873f, 5.673f, 7.0873f, 6.3062f, 6.6967f, 6.6967f)
                curveTo(6.3062f, 7.0873f, 5.673f, 7.0873f, 5.2825f, 6.6967f)
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
                curveTo(16.9127f, 18.3271f, 16.9127f, 17.6939f, 17.3033f, 17.3034f)
                curveTo(17.6938f, 16.9129f, 18.327f, 16.9129f, 18.7175f, 17.3034f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.7175f, 6.6967f)
                curveTo(18.327f, 7.0873f, 17.6938f, 7.0873f, 17.3033f, 6.6967f)
                curveTo(16.9127f, 6.3062f, 16.9127f, 5.673f, 17.3033f, 5.2825f)
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
                curveTo(5.673f, 16.9127f, 6.3062f, 16.9127f, 6.6967f, 17.3033f)
                curveTo(7.0873f, 17.6938f, 7.0873f, 18.327f, 6.6967f, 18.7175f)
                close()
            }
        }
            .build()
        return _volumeKnob!!
    }

private var _volumeKnob: ImageVector? = null
