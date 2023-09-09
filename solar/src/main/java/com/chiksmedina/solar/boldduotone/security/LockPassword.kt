package com.chiksmedina.solar.boldduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.SecurityGroup

public val SecurityGroup.LockPassword: ImageVector
    get() {
        if (_lockPassword != null) {
            return _lockPassword!!
        }
        _lockPassword = Builder(name = "LockPassword", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 17.0f)
                curveTo(8.5523f, 17.0f, 9.0f, 16.5523f, 9.0f, 16.0f)
                curveTo(9.0f, 15.4477f, 8.5523f, 15.0f, 8.0f, 15.0f)
                curveTo(7.4477f, 15.0f, 7.0f, 15.4477f, 7.0f, 16.0f)
                curveTo(7.0f, 16.5523f, 7.4477f, 17.0f, 8.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 16.5523f, 13.0f, 16.0f)
                curveTo(13.0f, 15.4477f, 12.5523f, 15.0f, 12.0f, 15.0f)
                curveTo(11.4477f, 15.0f, 11.0f, 15.4477f, 11.0f, 16.0f)
                curveTo(11.0f, 16.5523f, 11.4477f, 17.0f, 12.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                curveTo(17.0f, 16.5523f, 16.5523f, 17.0f, 16.0f, 17.0f)
                curveTo(15.4477f, 17.0f, 15.0f, 16.5523f, 15.0f, 16.0f)
                curveTo(15.0f, 15.4477f, 15.4477f, 15.0f, 16.0f, 15.0f)
                curveTo(16.5523f, 15.0f, 17.0f, 15.4477f, 17.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 8.0f)
                curveTo(6.75f, 5.1005f, 9.1005f, 2.75f, 12.0f, 2.75f)
                curveTo(14.8995f, 2.75f, 17.25f, 5.1005f, 17.25f, 8.0f)
                verticalLineTo(10.0036f)
                curveTo(17.8174f, 10.0089f, 18.3135f, 10.022f, 18.75f, 10.0546f)
                verticalLineTo(8.0f)
                curveTo(18.75f, 4.2721f, 15.7279f, 1.25f, 12.0f, 1.25f)
                curveTo(8.2721f, 1.25f, 5.25f, 4.2721f, 5.25f, 8.0f)
                verticalLineTo(10.0546f)
                curveTo(5.6865f, 10.022f, 6.1826f, 10.0089f, 6.75f, 10.0036f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _lockPassword!!
    }

private var _lockPassword: ImageVector? = null
