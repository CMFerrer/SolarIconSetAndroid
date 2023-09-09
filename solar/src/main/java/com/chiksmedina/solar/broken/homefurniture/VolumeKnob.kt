package com.chiksmedina.solar.broken.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.HomeFurnitureGroup

public val HomeFurnitureGroup.VolumeKnob: ImageVector
    get() {
        if (_volumeKnob != null) {
            return _volumeKnob!!
        }
        _volumeKnob = Builder(name = "VolumeKnob", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 9.2386f, 14.7614f, 7.0f, 12.0f, 7.0f)
                curveTo(9.2386f, 7.0f, 7.0f, 9.2386f, 7.0f, 12.0f)
                curveTo(7.0f, 14.7614f, 9.2386f, 17.0f, 12.0f, 17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                verticalLineTo(11.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.5f)
                curveTo(13.0f, 4.0523f, 12.5523f, 4.5f, 12.0f, 4.5f)
                curveTo(11.4477f, 4.5f, 11.0f, 4.0523f, 11.0f, 3.5f)
                curveTo(11.0f, 2.9477f, 11.4477f, 2.5f, 12.0f, 2.5f)
                curveTo(12.5523f, 2.5f, 13.0f, 2.9477f, 13.0f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 13.0f)
                curveTo(19.9477f, 13.0f, 19.5f, 12.5523f, 19.5f, 12.0f)
                curveTo(19.5f, 11.4477f, 19.9477f, 11.0f, 20.5f, 11.0f)
                curveTo(21.0523f, 11.0f, 21.5f, 11.4477f, 21.5f, 12.0f)
                curveTo(21.5f, 12.5523f, 21.0523f, 13.0f, 20.5f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 13.0f)
                curveTo(2.9477f, 13.0f, 2.5f, 12.5523f, 2.5f, 12.0f)
                curveTo(2.5f, 11.4477f, 2.9477f, 11.0f, 3.5f, 11.0f)
                curveTo(4.0523f, 11.0f, 4.5f, 11.4477f, 4.5f, 12.0f)
                curveTo(4.5f, 12.5523f, 4.0523f, 13.0f, 3.5f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6966f, 5.2825f)
                curveTo(7.0871f, 5.673f, 7.0871f, 6.3062f, 6.6966f, 6.6967f)
                curveTo(6.3061f, 7.0873f, 5.6729f, 7.0873f, 5.2824f, 6.6967f)
                curveTo(4.8919f, 6.3062f, 4.8919f, 5.673f, 5.2824f, 5.2825f)
                curveTo(5.6729f, 4.892f, 6.3061f, 4.892f, 6.6966f, 5.2825f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7176f, 17.3034f)
                curveTo(19.1081f, 17.6939f, 19.1081f, 18.3271f, 18.7176f, 18.7176f)
                curveTo(18.3271f, 19.1081f, 17.6939f, 19.1081f, 17.3034f, 18.7176f)
                curveTo(16.9129f, 18.3271f, 16.9129f, 17.6939f, 17.3034f, 17.3034f)
                curveTo(17.6939f, 16.9129f, 18.3271f, 16.9129f, 18.7176f, 17.3034f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7176f, 6.6967f)
                curveTo(18.3271f, 7.0873f, 17.6939f, 7.0873f, 17.3034f, 6.6967f)
                curveTo(16.9129f, 6.3062f, 16.9129f, 5.673f, 17.3034f, 5.2825f)
                curveTo(17.6939f, 4.892f, 18.3271f, 4.892f, 18.7176f, 5.2825f)
                curveTo(19.1081f, 5.673f, 19.1081f, 6.3062f, 18.7176f, 6.6967f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6966f, 18.7175f)
                curveTo(6.3061f, 19.108f, 5.6729f, 19.108f, 5.2824f, 18.7175f)
                curveTo(4.8919f, 18.327f, 4.8919f, 17.6938f, 5.2824f, 17.3033f)
                curveTo(5.6729f, 16.9127f, 6.3061f, 16.9127f, 6.6966f, 17.3033f)
                curveTo(7.0871f, 17.6938f, 7.0871f, 18.327f, 6.6966f, 18.7175f)
                close()
            }
        }
        .build()
        return _volumeKnob!!
    }

private var _volumeKnob: ImageVector? = null
