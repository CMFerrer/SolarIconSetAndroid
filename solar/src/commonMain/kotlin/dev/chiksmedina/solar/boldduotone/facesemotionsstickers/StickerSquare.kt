package dev.chiksmedina.solar.boldduotone.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.FacesEmotionsStickersGroup

val FacesEmotionsStickersGroup.StickerSquare: ImageVector
    get() {
        if (_stickerSquare != null) {
            return _stickerSquare!!
        }
        _stickerSquare = Builder(
            name = "StickerSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 15.0f)
                curveTo(21.4162f, 15.0f, 20.9239f, 15.0f, 20.5f, 15.0076f)
                curveTo(19.5724f, 15.0241f, 18.9718f, 15.0768f, 18.4549f, 15.2447f)
                curveTo(16.9327f, 15.7393f, 15.7393f, 16.9327f, 15.2447f, 18.4549f)
                curveTo(15.0768f, 18.9718f, 15.0241f, 19.5724f, 15.0076f, 20.5f)
                curveTo(15.0f, 20.9239f, 15.0f, 21.4162f, 15.0f, 22.0f)
                curveTo(15.4827f, 22.0f, 15.954f, 21.9511f, 16.4092f, 21.8581f)
                lineTo(16.4107f, 21.8578f)
                lineTo(16.4582f, 21.8479f)
                lineTo(16.4617f, 21.8472f)
                lineTo(16.5f, 21.8389f)
                curveTo(19.162f, 21.2577f, 21.2577f, 19.162f, 21.8389f, 16.5f)
                curveTo(21.9444f, 16.0168f, 22.0f, 15.5149f, 22.0f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 13.1283f, 22.0f, 14.1217f, 21.9799f, 15.0f)
                curveTo(21.4049f, 15.0f, 20.9191f, 15.0001f, 20.5f, 15.0076f)
                curveTo(19.5724f, 15.0241f, 18.9718f, 15.0768f, 18.4549f, 15.2447f)
                curveTo(16.9327f, 15.7393f, 15.7393f, 16.9327f, 15.2447f, 18.4549f)
                curveTo(15.0768f, 18.9718f, 15.0241f, 19.5724f, 15.0076f, 20.5f)
                curveTo(15.0001f, 20.9191f, 15.0f, 21.4049f, 15.0f, 21.9799f)
                curveTo(14.1217f, 22.0f, 13.1283f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
            .build()
        return _stickerSquare!!
    }

private var _stickerSquare: ImageVector? = null
