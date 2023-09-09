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

public val SecurityGroup.LockKeyhole: ImageVector
    get() {
        if (_lockKeyhole != null) {
            return _lockKeyhole!!
        }
        _lockKeyhole = Builder(name = "LockKeyhole", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(6.0f, 7.6593f, 6.0284f, 7.3252f, 6.083f, 7.0f)
                moveTo(18.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(18.0f, 4.6863f, 15.3137f, 2.0f, 12.0f, 2.0f)
                curveTo(10.208f, 2.0f, 8.5994f, 2.7856f, 7.5f, 4.0313f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 22.0f, 3.7574f, 22.0f, 2.8787f, 21.1213f)
                curveTo(2.0f, 20.2426f, 2.0f, 18.8284f, 2.0f, 16.0f)
                curveTo(2.0f, 13.1716f, 2.0f, 11.7574f, 2.8787f, 10.8787f)
                curveTo(3.7574f, 10.0f, 5.1716f, 10.0f, 8.0f, 10.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 10.0f, 20.2426f, 10.0f, 21.1213f, 10.8787f)
                curveTo(22.0f, 11.7574f, 22.0f, 13.1716f, 22.0f, 16.0f)
                curveTo(22.0f, 18.8284f, 22.0f, 20.2426f, 21.1213f, 21.1213f)
                curveTo(20.2426f, 22.0f, 18.8284f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(15.0f)
            }
        }
        .build()
        return _lockKeyhole!!
    }

private var _lockKeyhole: ImageVector? = null
