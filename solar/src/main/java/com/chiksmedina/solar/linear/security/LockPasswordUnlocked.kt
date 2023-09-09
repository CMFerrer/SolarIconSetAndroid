package com.chiksmedina.solar.linear.security

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
import com.chiksmedina.solar.linear.SecurityGroup

public val SecurityGroup.LockPasswordUnlocked: ImageVector
    get() {
        if (_lockPasswordUnlocked != null) {
            return _lockPasswordUnlocked!!
        }
        _lockPasswordUnlocked = Builder(name = "LockPasswordUnlocked", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                curveTo(2.0f, 13.1716f, 2.0f, 11.7574f, 2.8787f, 10.8787f)
                curveTo(3.7574f, 10.0f, 5.1716f, 10.0f, 8.0f, 10.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 10.0f, 20.2426f, 10.0f, 21.1213f, 10.8787f)
                curveTo(22.0f, 11.7574f, 22.0f, 13.1716f, 22.0f, 16.0f)
                curveTo(22.0f, 18.8284f, 22.0f, 20.2426f, 21.1213f, 21.1213f)
                curveTo(20.2426f, 22.0f, 18.8284f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 22.0f, 3.7574f, 22.0f, 2.8787f, 21.1213f)
                curveTo(2.0f, 20.2426f, 2.0f, 18.8284f, 2.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(6.0f, 4.6863f, 8.6863f, 2.0f, 12.0f, 2.0f)
                curveTo(14.7958f, 2.0f, 17.1449f, 3.9122f, 17.811f, 6.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                horizontalLineTo(8.009f)
                moveTo(11.991f, 16.0f)
                horizontalLineTo(12.0f)
                moveTo(15.991f, 16.0f)
                horizontalLineTo(16.0f)
            }
        }
        .build()
        return _lockPasswordUnlocked!!
    }

private var _lockPasswordUnlocked: ImageVector? = null
