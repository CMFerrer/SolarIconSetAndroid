package com.chiksmedina.solar.boldduotone.arrows

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
import com.chiksmedina.solar.boldduotone.ArrowsGroup

public val ArrowsGroup.RoundArrowRightDown: ImageVector
    get() {
        if (_roundArrowRightDown != null) {
            return _roundArrowRightDown!!
        }
        _roundArrowRightDown = Builder(name = "RoundArrowRightDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 15.75f)
                curveTo(10.0858f, 15.75f, 9.75f, 15.4142f, 9.75f, 15.0f)
                curveTo(9.75f, 14.5858f, 10.0858f, 14.25f, 10.5f, 14.25f)
                horizontalLineTo(13.1893f)
                lineTo(8.4697f, 9.5303f)
                curveTo(8.1768f, 9.2374f, 8.1768f, 8.7626f, 8.4697f, 8.4697f)
                curveTo(8.7626f, 8.1768f, 9.2374f, 8.1768f, 9.5303f, 8.4697f)
                lineTo(14.25f, 13.1893f)
                verticalLineTo(10.5f)
                curveTo(14.25f, 10.0858f, 14.5858f, 9.75f, 15.0f, 9.75f)
                curveTo(15.4142f, 9.75f, 15.75f, 10.0858f, 15.75f, 10.5f)
                verticalLineTo(15.0f)
                curveTo(15.75f, 15.4142f, 15.4142f, 15.75f, 15.0f, 15.75f)
                horizontalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _roundArrowRightDown!!
    }

private var _roundArrowRightDown: ImageVector? = null
