package com.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsGroup

public val ArrowsGroup.ArrowLeftDown: ImageVector
    get() {
        if (_arrowLeftDown != null) {
            return _arrowLeftDown!!
        }
        _arrowLeftDown = Builder(name = "ArrowLeftDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5303f, 6.5303f)
                curveTo(18.8232f, 6.2374f, 18.8232f, 5.7626f, 18.5303f, 5.4697f)
                curveTo(18.2374f, 5.1768f, 17.7626f, 5.1768f, 17.4697f, 5.4697f)
                lineTo(10.5f, 12.4393f)
                lineTo(6.5303f, 8.4697f)
                curveTo(6.3158f, 8.2552f, 5.9932f, 8.191f, 5.713f, 8.3071f)
                curveTo(5.4327f, 8.4232f, 5.25f, 8.6966f, 5.25f, 9.0f)
                verticalLineTo(18.0f)
                curveTo(5.25f, 18.4142f, 5.5858f, 18.75f, 6.0f, 18.75f)
                lineTo(15.0f, 18.75f)
                curveTo(15.3033f, 18.75f, 15.5768f, 18.5673f, 15.6929f, 18.287f)
                curveTo(15.809f, 18.0068f, 15.7448f, 17.6842f, 15.5303f, 17.4697f)
                lineTo(11.5607f, 13.5f)
                lineTo(18.5303f, 6.5303f)
                close()
            }
        }
        .build()
        return _arrowLeftDown!!
    }

private var _arrowLeftDown: ImageVector? = null
