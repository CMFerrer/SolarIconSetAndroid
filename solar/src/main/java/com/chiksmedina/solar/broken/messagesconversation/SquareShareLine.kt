package com.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MessagesConversationGroup

public val MessagesConversationGroup.SquareShareLine: ImageVector
    get() {
        if (_squareShareLine != null) {
            return _squareShareLine!!
        }
        _squareShareLine = Builder(name = "SquareShareLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(12.1824f, 7.0f, 11.0867f, 7.892f, 10.6804f, 8.3003f)
                curveTo(10.5546f, 8.4267f, 10.4917f, 8.49f, 10.4908f, 8.4908f)
                curveTo(10.49f, 8.4917f, 10.4267f, 8.5546f, 10.3003f, 8.6804f)
                curveTo(9.892f, 9.0867f, 9.0f, 10.1824f, 9.0f, 12.0f)
                verticalLineTo(15.0f)
                moveTo(22.0f, 7.0f)
                lineTo(17.0f, 2.0f)
                moveTo(22.0f, 7.0f)
                lineTo(17.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4648f, 20.5352f)
                curveTo(4.9297f, 22.0f, 7.2873f, 22.0f, 12.0026f, 22.0f)
                curveTo(16.7179f, 22.0f, 19.0755f, 22.0f, 20.5404f, 20.5352f)
                curveTo(21.7815f, 19.294f, 21.9711f, 17.4119f, 22.0f, 13.9979f)
                moveTo(3.4648f, 20.5352f)
                curveTo(2.0f, 19.0703f, 2.0f, 16.7127f, 2.0f, 11.9974f)
                moveTo(3.4648f, 20.5352f)
                curveTo(4.9293f, 21.9996f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(21.7764f, 19.2946f, 21.9659f, 17.4129f, 21.9948f, 13.9994f)
                moveTo(3.4648f, 20.5352f)
                curveTo(2.0004f, 19.0707f, 2.0f, 16.714f, 2.0f, 12.0f)
                moveTo(3.4648f, 3.4596f)
                curveTo(4.706f, 2.2185f, 6.5881f, 2.0289f, 10.0021f, 2.0f)
                moveTo(2.0551f, 8.0f)
                curveTo(2.1644f, 5.8066f, 2.4907f, 4.4382f, 3.4645f, 3.4645f)
                curveTo(4.7053f, 2.2236f, 6.5869f, 2.0341f, 10.0f, 2.0052f)
            }
        }
        .build()
        return _squareShareLine!!
    }

private var _squareShareLine: ImageVector? = null
