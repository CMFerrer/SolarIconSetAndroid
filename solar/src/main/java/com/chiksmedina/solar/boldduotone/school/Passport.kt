package com.chiksmedina.solar.boldduotone.school

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
import com.chiksmedina.solar.boldduotone.SchoolGroup

public val SchoolGroup.Passport: ImageVector
    get() {
        if (_passport != null) {
            return _passport!!
        }
        _passport = Builder(name = "Passport", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 13.0f)
                curveTo(9.75f, 11.7574f, 10.7574f, 10.75f, 12.0f, 10.75f)
                curveTo(13.2426f, 10.75f, 14.25f, 11.7574f, 14.25f, 13.0f)
                curveTo(14.25f, 14.2426f, 13.2426f, 15.25f, 12.0f, 15.25f)
                curveTo(10.7574f, 15.25f, 9.75f, 14.2426f, 9.75f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 18.6943f)
                verticalLineTo(4.6943f)
                curveTo(4.0f, 5.2466f, 4.4477f, 5.6943f, 5.0f, 5.6943f)
                horizontalLineTo(17.0f)
                curveTo(18.6569f, 5.6943f, 20.0f, 7.0375f, 20.0f, 8.6943f)
                verticalLineTo(18.6943f)
                curveTo(20.0f, 20.3512f, 18.6569f, 21.6943f, 17.0f, 21.6943f)
                horizontalLineTo(7.0f)
                curveTo(5.3432f, 21.6943f, 4.0f, 20.3512f, 4.0f, 18.6943f)
                close()
                moveTo(8.25f, 13.0f)
                curveTo(8.25f, 10.9289f, 9.9289f, 9.25f, 12.0f, 9.25f)
                curveTo(14.0711f, 9.25f, 15.75f, 10.9289f, 15.75f, 13.0f)
                curveTo(15.75f, 15.0711f, 14.0711f, 16.75f, 12.0f, 16.75f)
                curveTo(9.9289f, 16.75f, 8.25f, 15.0711f, 8.25f, 13.0f)
                close()
                moveTo(9.25f, 19.0f)
                curveTo(9.25f, 18.5858f, 9.5858f, 18.25f, 10.0f, 18.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 18.25f, 14.75f, 18.5858f, 14.75f, 19.0f)
                curveTo(14.75f, 19.4142f, 14.4142f, 19.75f, 14.0f, 19.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 19.75f, 9.25f, 19.4142f, 9.25f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 4.0004f)
                verticalLineTo(5.865f)
                curveTo(17.6872f, 5.7545f, 17.3506f, 5.6943f, 17.0f, 5.6943f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 5.6943f, 4.0f, 5.2466f, 4.0f, 4.6943f)
                verticalLineTo(4.6233f)
                curveTo(4.0f, 4.0903f, 4.3919f, 3.6384f, 4.9196f, 3.563f)
                lineTo(15.7172f, 2.0205f)
                curveTo(16.922f, 1.8484f, 18.0f, 2.7833f, 18.0f, 4.0004f)
                close()
            }
        }
        .build()
        return _passport!!
    }

private var _passport: ImageVector? = null
