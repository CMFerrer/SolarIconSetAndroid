package com.chiksmedina.solar.lineduotone.security

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
import com.chiksmedina.solar.lineduotone.SecurityGroup

public val SecurityGroup.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(name = "Incognito", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 17.5f)
                curveTo(21.0f, 19.433f, 19.433f, 21.0f, 17.5f, 21.0f)
                curveTo(15.567f, 21.0f, 14.0f, 19.433f, 14.0f, 17.5f)
                curveTo(14.0f, 15.567f, 15.567f, 14.0f, 17.5f, 14.0f)
                curveTo(19.433f, 14.0f, 21.0f, 15.567f, 21.0f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 11.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 11.0f)
                lineTo(4.6138f, 8.5448f)
                curveTo(5.1595f, 6.3621f, 5.4323f, 5.2708f, 6.2461f, 4.6354f)
                curveTo(7.0599f, 4.0f, 8.1848f, 4.0f, 10.4347f, 4.0f)
                horizontalLineTo(13.5653f)
                curveTo(15.8152f, 4.0f, 16.9401f, 4.0f, 17.7539f, 4.6354f)
                curveTo(18.5677f, 5.2708f, 18.8405f, 6.3621f, 19.3862f, 8.5448f)
                lineTo(20.0f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 17.5f)
                curveTo(10.0f, 19.433f, 8.433f, 21.0f, 6.5f, 21.0f)
                curveTo(4.567f, 21.0f, 3.0f, 19.433f, 3.0f, 17.5f)
                curveTo(3.0f, 15.567f, 4.567f, 14.0f, 6.5f, 14.0f)
                curveTo(8.433f, 14.0f, 10.0f, 15.567f, 10.0f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 17.5f)
                lineTo(10.6584f, 17.1708f)
                curveTo(11.5029f, 16.7485f, 12.4971f, 16.7485f, 13.3416f, 17.1708f)
                lineTo(14.0f, 17.5f)
            }
        }
        .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
