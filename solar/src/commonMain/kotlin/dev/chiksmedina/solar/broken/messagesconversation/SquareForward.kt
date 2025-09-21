package dev.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MessagesConversationGroup

val MessagesConversationGroup.SquareForward: ImageVector
    get() {
        if (_squareForward != null) {
            return _squareForward!!
        }
        _squareForward = Builder(
            name = "SquareForward", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.1549f, 3.4341f)
                lineTo(18.5122f, 5.4771f)
                curveTo(20.1349f, 6.8835f, 20.9462f, 7.5866f, 20.9462f, 8.4999f)
                curveTo(20.9462f, 9.4131f, 20.1349f, 10.1163f, 18.5122f, 11.5226f)
                lineTo(16.1549f, 13.5656f)
                curveTo(15.4414f, 14.184f, 15.0846f, 14.4932f, 14.7923f, 14.3597f)
                curveTo(14.5f, 14.2262f, 14.5f, 13.7541f, 14.5f, 12.8099f)
                verticalLineTo(11.2856f)
                curveTo(11.5f, 11.2856f, 8.25f, 12.6785f, 7.0f, 14.9999f)
                curveTo(7.0f, 7.5713f, 11.4444f, 5.7142f, 14.5f, 5.7142f)
                verticalLineTo(4.1898f)
                curveTo(14.5f, 3.2456f, 14.5f, 2.7735f, 14.7923f, 2.64f)
                curveTo(15.0846f, 2.5066f, 15.4414f, 2.8157f, 16.1549f, 3.4341f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                moveTo(12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                moveTo(12.0f, 22.0f)
                lineTo(12.0026f, 22.0f)
                curveTo(12.2973f, 22.0f, 12.5828f, 22.0f, 12.8595f, 21.9996f)
                moveTo(3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 12.018f, 2.0f, 12.0359f, 2.0f, 12.0538f)
                moveTo(3.4645f, 20.5355f)
                curveTo(2.828f, 19.8991f, 2.4685f, 19.0937f, 2.2649f, 18.0f)
                curveTo(2.0019f, 16.5866f, 2.0f, 14.691f, 2.0f, 12.0538f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                moveTo(20.5355f, 20.5355f)
                curveTo(19.1629f, 21.9082f, 17.0062f, 21.9942f, 12.8595f, 21.9996f)
                moveTo(20.5355f, 20.5355f)
                curveTo(21.7764f, 19.2946f, 21.9659f, 17.4129f, 21.9948f, 13.9994f)
                moveTo(12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                moveTo(3.4645f, 3.4645f)
                curveTo(2.4907f, 4.4382f, 2.1644f, 5.8066f, 2.0551f, 8.0f)
                moveTo(3.4645f, 3.4645f)
                curveTo(4.7053f, 2.2236f, 6.5869f, 2.0341f, 10.0f, 2.0052f)
                moveTo(2.0f, 11.9974f)
                curveTo(2.0f, 12.0162f, 2.0f, 12.0351f, 2.0f, 12.0538f)
                moveTo(12.8595f, 21.9996f)
                curveTo(17.0091f, 21.9943f, 19.1671f, 21.9084f, 20.5404f, 20.5352f)
                curveTo(21.7815f, 19.294f, 21.9711f, 17.4119f, 22.0f, 13.9979f)
                moveTo(10.0021f, 2.0f)
                curveTo(6.5881f, 2.0289f, 4.706f, 2.2185f, 3.4648f, 3.4596f)
            }
        }
            .build()
        return _squareForward!!
    }

private var _squareForward: ImageVector? = null
