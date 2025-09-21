package dev.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.DesignToolsGroup

val DesignToolsGroup.PaletteRound: ImageVector
    get() {
        if (_paletteRound != null) {
            return _paletteRound!!
        }
        _paletteRound = Builder(
            name = "PaletteRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 6.0f)
                curveTo(1.25f, 3.3767f, 3.3767f, 1.25f, 6.0f, 1.25f)
                curveTo(8.6234f, 1.25f, 10.75f, 3.3767f, 10.75f, 6.0f)
                verticalLineTo(6.432f)
                lineTo(12.7833f, 4.3987f)
                curveTo(14.6383f, 2.5437f, 17.6459f, 2.5437f, 19.5008f, 4.3987f)
                curveTo(21.3558f, 6.2537f, 21.3558f, 9.2612f, 19.5008f, 11.1162f)
                lineTo(17.367f, 13.25f)
                horizontalLineTo(18.0f)
                curveTo(20.6234f, 13.25f, 22.75f, 15.3766f, 22.75f, 18.0f)
                curveTo(22.75f, 20.6234f, 20.6234f, 22.75f, 18.0f, 22.75f)
                horizontalLineTo(6.0f)
                curveTo(3.3767f, 22.75f, 1.25f, 20.6234f, 1.25f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(9.4641f, 21.25f)
                horizontalLineTo(18.0f)
                curveTo(19.7949f, 21.25f, 21.25f, 19.7949f, 21.25f, 18.0f)
                curveTo(21.25f, 16.2051f, 19.7949f, 14.75f, 18.0f, 14.75f)
                horizontalLineTo(15.867f)
                lineTo(9.8889f, 20.7281f)
                curveTo(9.7596f, 20.9121f, 9.6176f, 21.0865f, 9.4641f, 21.25f)
                close()
                moveTo(10.75f, 17.7457f)
                lineTo(18.4402f, 10.0555f)
                curveTo(19.7094f, 8.7863f, 19.7094f, 6.7285f, 18.4402f, 5.4593f)
                curveTo(17.171f, 4.1901f, 15.1132f, 4.1901f, 13.844f, 5.4593f)
                lineTo(10.75f, 8.5533f)
                verticalLineTo(17.7457f)
                close()
                moveTo(6.0f, 2.75f)
                curveTo(4.2051f, 2.75f, 2.75f, 4.2051f, 2.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.75f, 19.7949f, 4.2051f, 21.25f, 6.0f, 21.25f)
                curveTo(7.7949f, 21.25f, 9.25f, 19.7949f, 9.25f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(9.25f, 4.2051f, 7.7949f, 2.75f, 6.0f, 2.75f)
                close()
                moveTo(6.0f, 17.75f)
                curveTo(5.8619f, 17.75f, 5.75f, 17.8619f, 5.75f, 18.0f)
                curveTo(5.75f, 18.1381f, 5.8619f, 18.25f, 6.0f, 18.25f)
                curveTo(6.1381f, 18.25f, 6.25f, 18.1381f, 6.25f, 18.0f)
                curveTo(6.25f, 17.8619f, 6.1381f, 17.75f, 6.0f, 17.75f)
                close()
                moveTo(4.25f, 18.0f)
                curveTo(4.25f, 17.0335f, 5.0335f, 16.25f, 6.0f, 16.25f)
                curveTo(6.9665f, 16.25f, 7.75f, 17.0335f, 7.75f, 18.0f)
                curveTo(7.75f, 18.9665f, 6.9665f, 19.75f, 6.0f, 19.75f)
                curveTo(5.0335f, 19.75f, 4.25f, 18.9665f, 4.25f, 18.0f)
                close()
            }
        }
            .build()
        return _paletteRound!!
    }

private var _paletteRound: ImageVector? = null
