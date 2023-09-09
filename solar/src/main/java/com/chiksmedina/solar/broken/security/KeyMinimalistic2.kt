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

public val SecurityGroup.KeyMinimalistic2: ImageVector
    get() {
        if (_keyMinimalistic2 != null) {
            return _keyMinimalistic2!!
        }
        _keyMinimalistic2 = Builder(name = "KeyMinimalistic2", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0635f, 12.5f)
                curveTo(21.6591f, 11.4704f, 22.0f, 10.275f, 22.0f, 9.0f)
                curveTo(22.0f, 5.134f, 18.866f, 2.0f, 15.0f, 2.0f)
                curveTo(11.134f, 2.0f, 8.0f, 5.134f, 8.0f, 9.0f)
                curveTo(8.0f, 12.866f, 11.134f, 16.0f, 15.0f, 16.0f)
                curveTo(16.0736f, 16.0f, 17.0907f, 15.7583f, 18.0f, 15.3264f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 20.5f)
                lineTo(9.5f, 14.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 21.0f)
                lineTo(4.5f, 19.5f)
                moveTo(6.5f, 17.5f)
                lineTo(8.0f, 19.0f)
            }
        }
        .build()
        return _keyMinimalistic2!!
    }

private var _keyMinimalistic2: ImageVector? = null
