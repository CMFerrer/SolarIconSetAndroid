package com.chiksmedina.solar.broken.security

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
import com.chiksmedina.solar.broken.SecurityGroup

public val SecurityGroup.BombEmoji: ImageVector
    get() {
        if (_bombEmoji != null) {
            return _bombEmoji!!
        }
        _bombEmoji = Builder(name = "BombEmoji", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                lineTo(12.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.5f)
                curveTo(14.0f, 13.3284f, 13.5523f, 14.0f, 13.0f, 14.0f)
                curveTo(12.4477f, 14.0f, 12.0f, 13.3284f, 12.0f, 12.5f)
                curveTo(12.0f, 11.6716f, 12.4477f, 11.0f, 13.0f, 11.0f)
                curveTo(13.5523f, 11.0f, 14.0f, 11.6716f, 14.0f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.5f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                lineTo(15.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.9811f, 2.3532f)
                curveTo(18.1668f, 1.8823f, 18.8332f, 1.8823f, 19.0189f, 2.3532f)
                lineTo(19.6733f, 4.0124f)
                curveTo(19.73f, 4.1562f, 19.8438f, 4.27f, 19.9876f, 4.3267f)
                lineTo(21.6468f, 4.9811f)
                curveTo(22.1177f, 5.1668f, 22.1177f, 5.8332f, 21.6468f, 6.0189f)
                lineTo(19.9876f, 6.6733f)
                curveTo(19.8438f, 6.73f, 19.73f, 6.8438f, 19.6733f, 6.9876f)
                lineTo(19.0189f, 8.6468f)
                curveTo(18.8332f, 9.1177f, 18.1668f, 9.1177f, 17.9811f, 8.6468f)
                lineTo(17.3267f, 6.9876f)
                curveTo(17.27f, 6.8438f, 17.1562f, 6.73f, 17.0124f, 6.6733f)
                lineTo(15.3532f, 6.0189f)
                curveTo(14.8823f, 5.8332f, 14.8823f, 5.1668f, 15.3532f, 4.9811f)
                lineTo(17.0124f, 4.3267f)
                curveTo(17.1562f, 4.27f, 17.27f, 4.1562f, 17.3267f, 4.0124f)
                lineTo(17.9811f, 2.3532f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.75f, 8.0034f)
                curveTo(6.8531f, 7.3652f, 8.1339f, 7.0f, 9.5f, 7.0f)
                curveTo(13.6421f, 7.0f, 17.0f, 10.3579f, 17.0f, 14.5f)
                curveTo(17.0f, 18.6421f, 13.6421f, 22.0f, 9.5f, 22.0f)
                curveTo(5.3579f, 22.0f, 2.0f, 18.6421f, 2.0f, 14.5f)
                curveTo(2.0f, 13.1339f, 2.3652f, 11.8532f, 3.0034f, 10.75f)
            }
        }
        .build()
        return _bombEmoji!!
    }

private var _bombEmoji: ImageVector? = null
