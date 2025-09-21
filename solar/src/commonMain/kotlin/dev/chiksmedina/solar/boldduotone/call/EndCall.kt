package dev.chiksmedina.solar.boldduotone.call

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
import dev.chiksmedina.solar.boldduotone.CallGroup

val CallGroup.EndCall: ImageVector
    get() {
        if (_endCall != null) {
            return _endCall!!
        }
        _endCall = Builder(
            name = "EndCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.0f, 12.8619f)
                lineTo(8.0f, 13.4784f)
                curveTo(8.0f, 14.3306f, 7.4233f, 15.0825f, 6.58f, 15.3296f)
                lineTo(4.58f, 15.9157f)
                curveTo(3.2956f, 16.2921f, 2.0f, 15.3625f, 2.0f, 14.0645f)
                lineTo(2.0f, 12.1416f)
                curveTo(2.0f, 11.6527f, 2.1247f, 11.1706f, 2.4408f, 10.7891f)
                curveTo(3.1732f, 9.9051f, 4.8786f, 8.2819f, 8.0f, 7.4777f)
                verticalLineTo(12.8619f)
                close()
                moveTo(16.0f, 12.8619f)
                verticalLineTo(13.2501f)
                curveTo(16.0f, 14.2065f, 16.7227f, 15.0194f, 17.7004f, 15.1626f)
                lineTo(19.7004f, 15.4557f)
                curveTo(20.9105f, 15.6331f, 22.0f, 14.7269f, 22.0f, 13.5431f)
                verticalLineTo(11.4184f)
                curveTo(22.0f, 10.8315f, 21.8162f, 10.2543f, 21.3703f, 9.8562f)
                curveTo(20.5528f, 9.1261f, 18.8785f, 7.9756f, 16.0f, 7.3822f)
                verticalLineTo(12.8619f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 11.3965f)
                curveTo(16.0f, 11.3965f, 16.0f, 12.862f, 16.0f, 12.862f)
                verticalLineTo(7.3823f)
                curveTo(14.862f, 7.1477f, 13.5359f, 7.0002f, 12.0f, 7.0002f)
                curveTo(10.4641f, 7.0002f, 9.138f, 7.1846f, 8.0f, 7.4778f)
                verticalLineTo(12.862f)
                curveTo(8.0f, 12.862f, 8.0f, 11.3965f, 12.0f, 11.3965f)
                close()
            }
        }
            .build()
        return _endCall!!
    }

private var _endCall: ImageVector? = null
