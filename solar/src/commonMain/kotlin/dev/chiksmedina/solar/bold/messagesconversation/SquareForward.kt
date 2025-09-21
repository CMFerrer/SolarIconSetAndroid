package dev.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MessagesConversationGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 11.3985f, 22.0f, 10.8354f, 21.997f, 10.3076f)
                curveTo(21.5862f, 10.7103f, 21.0949f, 11.136f, 20.5683f, 11.5922f)
                lineTo(18.0794f, 13.7493f)
                curveTo(17.7752f, 14.0132f, 17.4343f, 14.309f, 17.1257f, 14.5071f)
                curveTo(16.8241f, 14.7006f, 16.0564f, 15.1293f, 15.1692f, 14.7242f)
                curveTo(14.2819f, 14.3191f, 14.1032f, 13.4581f, 14.0519f, 13.1035f)
                curveTo(14.0008f, 12.7497f, 13.9997f, 12.3119f, 13.9999f, 11.917f)
                curveTo(12.6707f, 12.1476f, 11.4038f, 12.6706f, 10.4734f, 13.3979f)
                lineTo(10.4235f, 13.4369f)
                curveTo(10.0553f, 13.7248f, 9.7025f, 14.0006f, 9.4185f, 14.1851f)
                curveTo(9.2746f, 14.2786f, 9.0548f, 14.4119f, 8.7973f, 14.4989f)
                curveTo(8.5621f, 14.5783f, 7.9799f, 14.7241f, 7.3799f, 14.3723f)
                curveTo(6.8389f, 14.055f, 6.6516f, 13.5503f, 6.5872f, 13.2661f)
                curveTo(6.5249f, 12.9916f, 6.5304f, 12.733f, 6.5391f, 12.5701f)
                curveTo(6.556f, 12.2557f, 6.6183f, 11.8537f, 6.6793f, 11.4602f)
                lineTo(6.6891f, 11.3965f)
                curveTo(7.164f, 8.3255f, 8.5011f, 6.2302f, 10.2382f, 4.9232f)
                curveTo(11.4376f, 4.0207f, 12.763f, 3.5421f, 13.9999f, 3.3377f)
                lineTo(13.9999f, 3.1133f)
                curveTo(13.9997f, 2.7501f, 13.9995f, 2.3473f, 14.0379f, 2.0055f)
                curveTo(13.4122f, 2.0f, 12.7347f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.1549f, 2.4341f)
                lineTo(19.5121f, 4.4771f)
                curveTo(21.1348f, 5.8835f, 21.9462f, 6.5866f, 21.9462f, 7.4999f)
                curveTo(21.9462f, 8.4131f, 21.1348f, 9.1163f, 19.5121f, 10.5226f)
                lineTo(17.1549f, 12.5656f)
                curveTo(16.4413f, 13.184f, 16.0846f, 13.4932f, 15.7922f, 13.3597f)
                curveTo(15.4999f, 13.2262f, 15.4999f, 12.7541f, 15.4999f, 11.8099f)
                verticalLineTo(10.2856f)
                curveTo(13.3755f, 10.2856f, 11.1257f, 10.9841f, 9.5496f, 12.2161f)
                curveTo(8.7262f, 12.8597f, 8.3146f, 13.1815f, 8.1387f, 13.0784f)
                curveTo(7.9628f, 12.9752f, 8.0324f, 12.5254f, 8.1715f, 11.6257f)
                curveTo(9.0161f, 6.164f, 12.8002f, 4.7142f, 15.4999f, 4.7142f)
                verticalLineTo(3.1898f)
                curveTo(15.4999f, 2.2456f, 15.4999f, 1.7735f, 15.7922f, 1.64f)
                curveTo(16.0846f, 1.5066f, 16.4413f, 1.8158f, 17.1549f, 2.4341f)
                close()
            }
        }
            .build()
        return _squareForward!!
    }

private var _squareForward: ImageVector? = null
