package com.chiksmedina.solar.lineduotone.school

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
import com.chiksmedina.solar.lineduotone.SchoolGroup

public val SchoolGroup.PassportMinimalistic: ImageVector
    get() {
        if (_passportMinimalistic != null) {
            return _passportMinimalistic!!
        }
        _passportMinimalistic = Builder(name = "PassportMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineTo(19.0f)
                curveTo(4.0f, 20.6569f, 5.3432f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(18.6569f, 22.0f, 20.0f, 20.6569f, 20.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(20.0f, 7.3432f, 18.6569f, 6.0f, 17.0f, 6.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(4.0f, 6.0f)
                verticalLineTo(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                verticalLineTo(6.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(15.7172f, 2.3261f)
                lineTo(15.6111f, 1.5837f)
                lineTo(15.6111f, 1.5837f)
                lineTo(15.7172f, 2.3261f)
                close()
                moveTo(4.9196f, 3.8686f)
                lineTo(4.8135f, 3.1262f)
                lineTo(4.8135f, 3.1262f)
                lineTo(4.9196f, 3.8686f)
                close()
                moveTo(5.0711f, 6.75f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.25f)
                horizontalLineTo(5.0711f)
                verticalLineTo(6.75f)
                close()
                moveTo(18.75f, 6.0f)
                verticalLineTo(4.306f)
                horizontalLineTo(17.25f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.75f)
                close()
                moveTo(15.6111f, 1.5837f)
                lineTo(4.8135f, 3.1262f)
                lineTo(5.0257f, 4.6111f)
                lineTo(15.8232f, 3.0686f)
                lineTo(15.6111f, 1.5837f)
                close()
                moveTo(4.8135f, 3.1262f)
                curveTo(3.9164f, 3.2543f, 3.25f, 4.0227f, 3.25f, 4.9289f)
                horizontalLineTo(4.75f)
                curveTo(4.75f, 4.7692f, 4.8675f, 4.6337f, 5.0257f, 4.6111f)
                lineTo(4.8135f, 3.1262f)
                close()
                moveTo(18.75f, 4.306f)
                curveTo(18.75f, 2.6325f, 17.2678f, 1.347f, 15.6111f, 1.5837f)
                lineTo(15.8232f, 3.0686f)
                curveTo(16.5763f, 2.961f, 17.25f, 3.5454f, 17.25f, 4.306f)
                horizontalLineTo(18.75f)
                close()
                moveTo(5.0711f, 5.25f)
                curveTo(4.8938f, 5.25f, 4.75f, 5.1063f, 4.75f, 4.9289f)
                horizontalLineTo(3.25f)
                curveTo(3.25f, 5.9347f, 4.0653f, 6.75f, 5.0711f, 6.75f)
                verticalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _passportMinimalistic!!
    }

private var _passportMinimalistic: ImageVector? = null
