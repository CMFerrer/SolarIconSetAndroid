package com.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsGroup

val ArrowsGroup.ArrowRightDown: ImageVector
    get() {
        if (_arrowRightDown != null) {
            return _arrowRightDown!!
        }
        _arrowRightDown = Builder(
            name = "ArrowRightDown", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.4697f, 8.4697f)
                curveTo(17.6842f, 8.2552f, 18.0068f, 8.191f, 18.287f, 8.3071f)
                curveTo(18.5673f, 8.4232f, 18.75f, 8.6967f, 18.75f, 9.0f)
                verticalLineTo(18.0f)
                curveTo(18.75f, 18.4142f, 18.4142f, 18.75f, 18.0f, 18.75f)
                lineTo(9.0f, 18.75f)
                curveTo(8.6967f, 18.75f, 8.4232f, 18.5673f, 8.3071f, 18.287f)
                curveTo(8.191f, 18.0068f, 8.2552f, 17.6842f, 8.4697f, 17.4697f)
                lineTo(17.4697f, 8.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.4697f, 6.5303f)
                curveTo(5.1768f, 6.2374f, 5.1768f, 5.7626f, 5.4697f, 5.4697f)
                curveTo(5.7626f, 5.1768f, 6.2374f, 5.1768f, 6.5303f, 5.4697f)
                lineTo(13.5f, 12.4393f)
                lineTo(12.4393f, 13.5f)
                lineTo(5.4697f, 6.5303f)
                close()
            }
        }
            .build()
        return _arrowRightDown!!
    }

private var _arrowRightDown: ImageVector? = null
