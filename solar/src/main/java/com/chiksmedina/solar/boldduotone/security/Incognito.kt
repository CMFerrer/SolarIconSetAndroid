package com.chiksmedina.solar.boldduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val SecurityGroup.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(name = "Incognito", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.5f)
                curveTo(21.0f, 18.433f, 19.433f, 20.0f, 17.5f, 20.0f)
                curveTo(15.567f, 20.0f, 14.0f, 18.433f, 14.0f, 16.5f)
                curveTo(14.0f, 14.567f, 15.567f, 13.0f, 17.5f, 13.0f)
                curveTo(19.433f, 13.0f, 21.0f, 14.567f, 21.0f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.25f, 10.0f)
                curveTo(1.25f, 9.5858f, 1.5858f, 9.25f, 2.0f, 9.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 9.25f, 22.75f, 9.5858f, 22.75f, 10.0f)
                curveTo(22.75f, 10.4142f, 22.4142f, 10.75f, 22.0f, 10.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 10.75f, 1.25f, 10.4142f, 1.25f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.1875f, 9.25f)
                lineTo(4.6138f, 7.5448f)
                curveTo(5.1595f, 5.3621f, 5.4323f, 4.2708f, 6.2461f, 3.6354f)
                curveTo(7.0599f, 3.0f, 8.1848f, 3.0f, 10.4347f, 3.0f)
                horizontalLineTo(13.5653f)
                curveTo(15.8152f, 3.0f, 16.9401f, 3.0f, 17.7539f, 3.6354f)
                curveTo(18.5677f, 4.2708f, 18.8405f, 5.3621f, 19.3862f, 7.5448f)
                lineTo(19.8125f, 9.25f)
                horizontalLineTo(4.1875f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 16.5f)
                curveTo(10.0f, 18.433f, 8.433f, 20.0f, 6.5f, 20.0f)
                curveTo(4.567f, 20.0f, 3.0f, 18.433f, 3.0f, 16.5f)
                curveTo(3.0f, 14.567f, 4.567f, 13.0f, 6.5f, 13.0f)
                curveTo(8.433f, 13.0f, 10.0f, 14.567f, 10.0f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.884f, 17.3966f)
                curveTo(9.9596f, 17.1104f, 9.9999f, 16.8099f, 9.9999f, 16.5f)
                curveTo(9.9999f, 16.2272f, 9.9687f, 15.9616f, 9.9096f, 15.7067f)
                lineTo(10.3232f, 15.4999f)
                curveTo(11.379f, 14.972f, 12.6216f, 14.972f, 13.6773f, 15.4999f)
                lineTo(14.0903f, 15.7064f)
                curveTo(14.0312f, 15.9614f, 13.9999f, 16.227f, 13.9999f, 16.5f)
                curveTo(13.9999f, 16.8098f, 14.0402f, 17.1101f, 14.1157f, 17.3961f)
                lineTo(13.0065f, 16.8415f)
                curveTo(12.3731f, 16.5248f, 11.6275f, 16.5248f, 10.9941f, 16.8415f)
                lineTo(9.884f, 17.3966f)
                close()
            }
        }
        .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
